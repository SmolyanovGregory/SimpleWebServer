package ru.otus.smolyanov.http;

public enum HttpHeader {

  ACCEPT("Accept"),	//Нет	Да	Нет	Нет	Нет	HTTP/1.0	Список допустимых форматов ресурса.	Accept: text/plain
  ACCEPT_CHARSET("Accept-Charset"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.0	Перечень поддерживаемых кодировок для предоставления пользователю.	Accept-Charset: utf-8
  ACCEPT_ENCODING("Accept-Encoding"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.0	Перечень поддерживаемых способов кодирования содержимого сущности при передаче.	Accept-Encoding: <compress | gzip | deflate | sdch | identity>
  ACCEPT_LANGUAGE("Accept-Language"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.0	Список поддерживаемых естественных языков.	Accept-Language: ru
  ACCEPT_RANGES("Accept-Ranges"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.1	Перечень единиц измерения диапазонов.	Accept-Ranges: bytes
  AGE("Age"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.1	Количество секунд с момента модификации ресурса.
  ALLOW("Allow"),//	Нет	Нет	Нет	Нет	Да	HTTP/1.0	Список поддерживаемых методов.	Allow: OPTIONS, GET, HEAD
  ALTERNATES("Alternates"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.1	Указание на альтернативные способы представления ресурса.
  AUTHORIZATION("Authorization"),//	Нет	Да	Нет	Нет	Нет	HTTP-Auth	Данные для авторизации.	Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==
  CACHE_CONTROL("Cache-Control"),//	Да	Нет	Нет	Нет	Нет	HTTP/1.1	Основные директивы для управления кэшированием.	Cache-Control: no-cache Cache-Control: no-store Cache-Control: max-age=3600  Cache-Control: max-stale=0   Cache-Control: min-fresh=0  Cache-Control: no-transform  Cache-Control: only-if-cached  Cache-Control: cache-extension  Connection	Да	Нет	Нет	Нет	Нет	HTTP/1.1	Сведения о проведении соединения.
  CONNECTION("Connection"),//: close
  CONTENT_BASE("Content-Base"),//	Нет	Нет	Нет	Нет	Да	HTTP/1.1	Сведения о постоянном местонахождении ресурса. Убрано в HTTP/1.1v2.
  CONTENT_DISPOSITION("Content-Disposition"),//	Нет	Да	Да	Да	Да	CDH	Способ распределения сущностей в сообщении при передаче нескольких фрагментов.	Content-Disposition: form-data; name="MessageTitle"  Content-Disposition: form-data; name="AttachedFile1"; filename="photo-1.jpg"
  CONTENT_ENCODING("Content-Encoding"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Способ кодирования содержимого сущности при передаче.
  CONTENT_LANGUAGE("Content-Language"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Один или несколько естественных языков содержимого сущности.	Content-Language: en, ase, ru
  CONTENT_LENGTH("Content-Length"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Размер содержимого сущности в октетах (которые в русском языке обычно называют байтами).	Content-Length: 1348
  CONTENT_LOCATION("Content-Location"),//	Нет	Нет	Да	Нет	Да	HTTP/1.1	Альтернативное расположение содержимого сущности.
  CONTENT_MD5("Content-MD5"),//	Нет	Нет	Да	Нет	Да	MD5H	Base64 MD5-хэша сущности для проверки целостности.	Content-MD5: Q2hlY2sgSW50ZWdyaXR5IQ==
  CONTENT_RANGE("Content-Range"),//	Нет	Нет	Да	Нет	Да	HTTP/1.1	Байтовые диапазоны передаваемой сущности если возвращается фрагмент. Подробности: Частичные GET.	Content-Range: bytes 88080384-160993791/160993792
  CONTENT_TYPE("Content-Type"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Формат и способ представления сущности.	Content-Type: text/html;charset=utf-8
  CONTENT_VERSION("Content-Version"),//	Нет	Нет	Да	Нет	Да	HTTP/1.1	Информация о текущей версии сущности.
  DATE("Date"), //	Да	Нет	Нет	Нет	Нет	HTTP/1.0	Дата генерации отклика.	Date: Tue, 15 Nov 1994 08:12:31 GMT
  DERIVED_FROM("Derived-From"),//	Нет	Нет	Да	Нет	Да	HTTP/1.1	Информация о текущей версии сущности. [?]
  ETAG("ETag"),//	Нет	Нет	Нет	Да	Да	HTTP/1.1	Тег (уникальный идентификатор) версии сущности, используемый при кэшировании.	ETag: "56d-9989200-1132c580"
  EXPECT("Expect"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1v2	Указывает серверу что клиент ожидает от него дополнительного действия.	Expect: 100-continue
  EXPIRES("Expires"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Дата предполагаемого истечения срока актуальности сущности.	Expires: Tue, 31 Jan 2012 15:02:53 GMT
  FROM("From"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Адрес электронной почты ответственного лица со стороны клиента.	From: user@example.com
  HOST("Host"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Доменное имя и порт хоста запрашиваемого ресурса. Необходимо для поддержки виртуального хостинга на серверах.	Host: ru.wikipedia.org
  IF_MATCH("If-Match"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Список тегов версий сущности. Выполнять метод, если они существуют.	If-Match: "737060cd8c284d8af7ad3082f209582d"
  IF_MODIFIED_SINCE("If-Modified-Since"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.0	Дата. Выполнять метод если сущность изменилась с указанного момента.	If-Modified-Since: Sat, 29 Oct 1994 19:43:31 GMT
  IF_NONE_MATCH("If-None-Match"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Список тегов версий сущности. Выполнять метод если ни одного из них не существует.	If-None-Match: "737060cd8c284d8af7ad3082f209582d"
  IF_RANGE("If-Range"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Список тегов версий сущности или дата для определённого фрагмента сущности.	If-Range: "737060cd8c284d8af7ad3082f209582d"
  IF_UNMODIFIED_SINCE("If-Unmodified-Since"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Дата. Выполнять метод если сущность не изменилась с указанной даты.	If-Unmodified-Since: Sat, 29 Oct 1994 19:43:31 GMT
  LAST_MODIFIED("Last-Modified"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Дата последней модификации сущности.
  LINK("Link"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Указывает на логически связанный с сущностью ресурс аналогично тегу <LINK> в HTML.
  LOCATION("Location"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.0	URI по которому клиенту следует перейти или URI созданного ресурса.	Location: http://example.com/about.html#contacts
  MAX_FORWARDS("Max-Forwards"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Максимально допустимое количество переходов через прокси.	Max-Forwards: 10
  MIME_Version("MIME-Version"),//	Да	Нет	Нет	Нет	Нет	MIME	Версия протокола MIME, по которому было сформировано сообщение.
  PRAGMA("Pragma"),//	Да	Нет	Нет	Нет	Нет	HTTP/1.0	Особенные опции выполнения операции.	Pragma: no-cache
  PROXY_AUTHENTICATE("Proxy-Authenticate"),//	Нет	Нет	Нет	Да	Нет	HTTP-Auth	Параметры аутентификации на прокси-сервере.
  PROXY_AUTHORIZATION("Proxy-Authorization"),//	Нет	Да	Нет	Нет	Нет	HTTP-Auth	Информация для авторизации на прокси-сервере.	Proxy-Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==
  PUBLIC("Public"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.1	Список доступных методов аналогично Allow, но для всего сервера.
  RANGE("Range"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1	Байтовые диапазоны для запроса фрагментов ресурса. Подробности: Частичные GET.	Range: bytes=50000-99999,250000-399999,500000-
  REFERER("Referer"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.0	URI ресурса, после которого клиент сделал текущий запрос.	Referer: http://en.wikipedia.org/wiki/Main_Page
  RETRY_AFTER("Retry-After"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.0	Дата или время в секундах после которого можно повторить запрос.
  SERVER("Server"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.0	Список названий и версий веб-сервера и его компонентов с комментариями. Для прокси-серверов поле Via.	Server: Apache/2.2.17 (Win32) PHP/5.3.5
  TITLE("Title"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Заголовок сущности.
  TE("TE"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.1v2	Список расширенных способов кодирования при передаче.	TE: trailers, deflate
  TRAILER("Trailer"),//	Да	Нет	Нет	Нет	Нет	HTTP/1.1v2	Список полей, имеющих отношение к кодированию сообщения при передаче.
  TRANSFER_ENCODING("Transfer-Encoding"),//	Да	Нет	Нет	Нет	Нет	HTTP/1.1	Список способов кодирования, которые были применены к сообщению для передачи.	Transfer-Encoding: chunked
  UPGRADE("Upgrade"),//	Да	Нет	Нет	Нет	Нет	HTTP/1.1	Список предлагаемых клиентом протоколов. Сервер указывает один протокол.	Upgrade: HTTP/2.0, SHTTP/1.3, IRC/6.9, RTA/x11
  URI("URI"),//	Нет	Нет	Да	Нет	Да	HTTP/1.0	Список URI. В HTTP/1.1 заменено на Location, Content-Location, Vary и Link.
  USER_AGENT("User-Agent"),//	Нет	Да	Нет	Нет	Нет	HTTP/1.0	Список названий и версий клиента и его компонентов с комментариями.	User-Agent: Mozilla/5.0 (X11; Linux i686; rv:2.0.1) Gecko/20100101 Firefox/4.0.1
  VARY("Vary"),//	Нет	Нет	Нет	Да	Нет	HTTP/1.1	Список описывающих ресурс полей из запроса, которые были приняты во внимание.	Vary: Accept-Encoding
  VIA("Via"),//	Да	Нет	Нет	Нет	Нет	HTTP/1.1	Список версий протокола, названий и версий прокси-серверов, через которых прошло сообщение.	Via: 1.0 fred, 1.1 nowhere.com (Apache/1.1)
  WARNING("Warning"),//	Да	Нет	Нет	Да	Нет	HTTP/1.1	Код, агент, сообщение и дата, если возникла критическая ситуация.	Warning: 199 Miscellaneous warning
  WWW_AUTHENTICATE("WWW-Authenticate"); // Нет	Нет	Нет	Да	Нет	HTTP-Auth	Параметры аутентификации для выполнения метода к указанному ресурсу.

  private final String headerName;

  HttpHeader(String headerName) {
    this.headerName = headerName;
  }

  public static HttpHeader fromString(String text) {
    for (HttpHeader e : HttpHeader.values()) {
      if (e.headerName.equalsIgnoreCase(text)) {
        return e;
      }
    }
    return null;
  }
}
