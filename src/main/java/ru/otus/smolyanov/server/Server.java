package ru.otus.smolyanov.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Server extends Thread {
  private final static Logger logger = LogManager.getLogger(Server.class.getName());
  private static final int THREADS_NUMBER = 2;
  private final int port;
  private final ExecutorService executor;
  private final Queue<Socket> requestQueue;

  public Server(int port) {
    this.port = port;
    executor = Executors.newFixedThreadPool(THREADS_NUMBER);
    requestQueue = new ConcurrentLinkedQueue<>();
  }

  @Override
  public synchronized void start(){
    super.start();
    executor.submit(this::process);

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      logger.info("Server started on port: " + serverSocket.getLocalPort());

      while (!executor.isShutdown()) {
        Socket socket = serverSocket.accept();
        logger.info("Socket - ok");
        requestQueue.add(socket);
      }
    } catch(IOException e) {
      logger.error(e.getMessage());
    }
  }

  @SuppressWarnings("InfiniteLoopStatement")
  private void process() {
    while (true) {
      if (!requestQueue.isEmpty()) {
        Socket socket = requestQueue.poll();

        if (socket != null) {
          try (InputStream inputStream = socket.getInputStream(); OutputStream outputStream = socket.getOutputStream()) {
            if (inputStream.available() > 0) {
              logger.info(">>>" + inputStream.available());
              byte[] buffer = new byte[inputStream.available()];
              int bytes = inputStream.read(buffer);
              String request = new String(buffer, 0, bytes);
              logger.debug(request);

              String response = "HTTP/1.1 404 Not Found\n" +
                      "Date: " + new Date() + "\n" +
                      "Content-Type: text/plain\n" +
                      "Connection: close\n" +
                      "Server: Server\n" +
                      "Pragma: no-cache\n\n" +
                      "test message";
              outputStream.write(response.getBytes());
              socket.close();
            }
          } catch (Exception e) {
            logger.error(e.getMessage());
          }
        }
      }

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        logger.error(e.toString());
      }
      logger.debug("queue size="+requestQueue.size());
    }
  }
}
