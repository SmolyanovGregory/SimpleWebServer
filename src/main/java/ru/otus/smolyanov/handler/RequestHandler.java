package ru.otus.smolyanov.handler;

import ru.otus.smolyanov.http.HttpRequest;
import ru.otus.smolyanov.http.HttpResponse;

public abstract class RequestHandler {
  protected RequestHandler nextHandler;
  protected HttpRequest request;
  protected HttpResponse response;

  public RequestHandler(HttpRequest request) {
    this.request = request;
  }

  public void setNextHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public abstract HttpResponse handleRequest();
}
