package com.sunny.apps.weather.interceptor;

import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

public class ClientRestTemplateCustomizer implements RestTemplateCustomizer {

  private final ClientRequestInterceptor clientRequestInterceptor;

  public ClientRestTemplateCustomizer(
      ClientRequestInterceptor clientRequestInterceptor) {
    this.clientRequestInterceptor = clientRequestInterceptor;
  }

  @Override
  public void customize(RestTemplate restTemplate) {
    restTemplate.getInterceptors().add(clientRequestInterceptor);
  }
}
