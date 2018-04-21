package ru.otus.smolyanov.http;

import java.util.Date;

public class HttpResponse {
  @Override
  public String toString() {
    return "HTTP/1.1 404 Not Found\n" +
            "Date: " + new Date() + "\n" +
            "Content-Type: text/html\n" +
            "Connection: close\n" +
            "Server: Server\n" +
            "Pragma: no-cache\n\n" +
            "<html><body><b>qwerty</b></body></html>"

            ;
  }
}
