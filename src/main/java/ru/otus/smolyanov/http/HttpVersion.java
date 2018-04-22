package ru.otus.smolyanov.http;

public enum HttpVersion {
  HTTP_0_9("HTTP/0.9"),
  HTTP_1_0("HTTP/1.0"),
  HTTP_1_1("HTTP/1.1"),
  HTTP_2("HTTP/2.0");

  private final String name;

  HttpVersion(String name) {
    this.name = name;
  }

  public static HttpVersion fromString(String text) {
    for (HttpVersion e : HttpVersion.values()) {
      if (e.name.equalsIgnoreCase(text)) {
        return e;
      }
    }
    return null;
  }
}
