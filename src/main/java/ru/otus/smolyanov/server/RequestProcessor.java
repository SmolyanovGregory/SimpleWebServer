package ru.otus.smolyanov.server;

import ru.otus.smolyanov.handler.*;
import ru.otus.smolyanov.http.HttpRequest;
import ru.otus.smolyanov.http.HttpResponse;

import java.util.ArrayList;
import java.util.List;

class RequestProcessor {
  private final HttpRequest httpRequest;
  private final List<RequestHandler> handlers = new ArrayList<>();

  public RequestProcessor(HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
  }

  HttpResponse processRequest() {
    handlers.add(new TraceRequestHandler(httpRequest));
    handlers.add(new DeleteRequestHandler(httpRequest));
    handlers.add(new OptionsRequestHandler(httpRequest));
    handlers.add(new PutRequestHandler(httpRequest));
    handlers.add(new HeadRequestHandler(httpRequest));
    handlers.add(new PostRequestHandler(httpRequest));
    handlers.add(new GetRequestHandler(httpRequest));

    RequestHandler nexHandler = null;
    for (RequestHandler handler : handlers) {
      handler.setNextHandler(nexHandler);
      nexHandler = handler;
    }

    HttpResponse result = handlers.get(handlers.size()-1).handleRequest();
    return result;
  }
}
