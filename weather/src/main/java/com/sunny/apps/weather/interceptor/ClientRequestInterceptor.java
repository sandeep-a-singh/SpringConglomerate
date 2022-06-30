package com.sunny.apps.weather.interceptor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class ClientRequestInterceptor implements ClientHttpRequestInterceptor {

  private static final Logger LOGGER = Logger
      .getLogger(ClientRequestInterceptor.class.getCanonicalName());

  @Override
  public ClientHttpResponse intercept(HttpRequest request, byte[] body,
      ClientHttpRequestExecution execution) throws IOException {
    LOGGER.info("API Request");
    LOGGER.log(Level.INFO, "URI - {0}", request.getURI());
    LOGGER.log(Level.INFO, "Headers - {0}", request.getHeaders());
    LOGGER.log(Level.INFO, "Method - {0}", request.getMethod());
    if (body != null) {
      LOGGER.log(Level.INFO, "Request Body - {0}", body);
    }

    ClientHttpResponse response = execution.execute(request, body);

    LOGGER.info("API Response");
    LOGGER.log(Level.INFO, "Status - {0}", response.getStatusCode());
    LOGGER.log(Level.INFO, "Headers - {0}", response.getHeaders());

    return response;
  }
}
