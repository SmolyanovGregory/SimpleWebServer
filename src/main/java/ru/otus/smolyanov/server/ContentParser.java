package ru.otus.smolyanov.server;

import ru.otus.smolyanov.http.*;
import java.util.StringTokenizer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContentParser {
  private final static Logger logger = LogManager.getLogger(ContentParser.class.getName());
  private byte[] content;

  public ContentParser(byte[] content) {
    this.content = content;
  }

  public HttpRequest parse() {
    HttpRequest request = new HttpRequest();

    String contetntString = new String(content, 0, content.length);


    StringTokenizer lines = new StringTokenizer(contetntString, "\r\n");
    int lineNumber = 0;
    while (lines.hasMoreTokens()) {
      lineNumber++;
      String currentRow = lines.nextToken();
      logger.debug(">>>"+currentRow);

      if (lineNumber == 1) {
        StringTokenizer firstLineTokenizer = new StringTokenizer(currentRow);

        HttpMethod method = HttpMethod.valueOf(firstLineTokenizer.nextToken());
        request.setMethod(method);
        request.setResourceName(firstLineTokenizer.nextToken());
        request.setHttpVersion(HttpVersion.fromString(firstLineTokenizer.nextToken()));

      } else {
        int idx = currentRow.indexOf(":");
        if (idx > -1) {
          String key = currentRow.substring(0, idx);
          String value = currentRow.substring(idx+1).trim();

          HttpHeader header = HttpHeader.fromString(key);
          if (header != null) {
            request.addHttpField(header, value);
          }
        }
      }
    }

    request.printHttpFields();
    return request;
  }
}
