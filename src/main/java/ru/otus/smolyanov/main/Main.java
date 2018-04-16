package ru.otus.smolyanov.main;

import ru.otus.smolyanov.server.Server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private final static Logger logger = LogManager.getLogger(Main.class.getName());

  public static void main(String ... vargs) {
    try {
      new Main().run();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run() throws InterruptedException {
    Server server = new Server(9090);
    server.start();
    server.join();
  }

}
