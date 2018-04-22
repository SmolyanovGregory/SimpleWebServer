package ru.otus.smolyanov.handler;

import ru.otus.smolyanov.http.HttpMethod;
import ru.otus.smolyanov.http.HttpRequest;
import ru.otus.smolyanov.http.HttpResponse;

public class GetRequestHandler extends RequestHandler {

  public GetRequestHandler(HttpRequest request) {
    super(request);
  }

  @Override
  public HttpResponse handleRequest() {
    HttpResponse response = new HttpResponse();
    if (request.getMethod() == HttpMethod.GET) {
      System.out.println("------> processed GET request");
      return new HttpResponse();
    }

    if (nextHandler != null) {
      response = nextHandler.handleRequest();
    }
    return response;
  }
}
