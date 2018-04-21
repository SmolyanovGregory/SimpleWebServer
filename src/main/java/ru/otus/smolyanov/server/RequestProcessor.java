package ru.otus.smolyanov.server;

import ru.otus.smolyanov.http.HttpRequest;
import ru.otus.smolyanov.http.HttpResponse;

public class RequestProcessor {
  private final HttpRequest httpRequest;

  public RequestProcessor(HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
  }

  HttpResponse processRequest() {
    HttpResponse result = new HttpResponse();
    return result;
  }
}
