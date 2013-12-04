package org.apache.oltu.oauth2.common;

import java.util.Map;

/**
 * HTTP Request
 */
public interface HttpRequest {

    String getParameter(String name);

    String[] getParameterValues(String name);

    Map<String, String[]> getParameterMap();

    String getHeader(String name);

    String getMethod();

    String getContentType();

    String getQueryString();
}
