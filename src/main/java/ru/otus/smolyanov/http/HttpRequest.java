package ru.otus.smolyanov.http;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
  private final static Logger logger = LogManager.getLogger(HttpRequest.class.getName());
  private HttpMethod method;
  private String resourceName;
  private HttpVersion httpVersion;
  private Map<HttpHeader, String> httpFields = new HashMap<>();

  public HttpMethod getMethod() {
    return method;
  }

  public void setMethod(HttpMethod method) {
    this.method = method;
  }

  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public HttpVersion getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(HttpVersion httpVersion) {
    this.httpVersion = httpVersion;
  }

  public void addHttpField(HttpHeader header, String value) {
    httpFields.put(header, value);

  }

  public void printHttpFields() {
    System.out.println("======================");
    for (HttpHeader header: httpFields.keySet()) {
      System.out.println(header+"="+httpFields.get(header));
    }
    System.out.println("======================");
  }
}
