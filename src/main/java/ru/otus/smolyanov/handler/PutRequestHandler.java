package ru.otus.smolyanov.handler;

import ru.otus.smolyanov.http.HttpMethod;
import ru.otus.smolyanov.http.HttpRequest;
import ru.otus.smolyanov.http.HttpResponse;

public class PutRequestHandler extends RequestHandler {
  public PutRequestHandler(HttpRequest request) {
    super(request);
  }

  @Override
  public HttpResponse handleRequest() {
    HttpResponse response = new HttpResponse();
    if (request.getMethod() == HttpMethod.PUT) {
      System.out.println("------> processed PUT request");
      return new HttpResponse();
    }

    if (nextHandler != null) {
      response = nextHandler.handleRequest();
    }
    return response;
  }
}
