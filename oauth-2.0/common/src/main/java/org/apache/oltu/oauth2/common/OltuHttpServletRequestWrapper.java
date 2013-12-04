package org.apache.oltu.oauth2.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 */
public class OltuHttpServletRequestWrapper extends HttpServletRequestWrapper implements HttpRequest {

    public OltuHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

}
