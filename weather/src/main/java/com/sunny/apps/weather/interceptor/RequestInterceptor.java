package com.sunny.apps.weather.interceptor;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestInterceptor implements HandlerInterceptor {
  private static final Logger LOGGER = Logger
      .getLogger(RequestInterceptor.class.getCanonicalName());

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    LOGGER.info(" Request");
    LOGGER.log(Level.INFO, "URI - {0}", request.getRequestURI());
    request.getHeaderNames().asIterator().forEachRemaining( name -> LOGGER.log(Level.INFO, "Headers Key: {0}, Value: {1} ", new Object[]{name, request.getHeader(name)}));
    LOGGER.log(Level.INFO, "Method - {0}", request.getMethod());
    LOGGER.log(Level.INFO, "Requested At - {0}", LocalDateTime.now());

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    LOGGER.info(" Response");
    LOGGER.log(Level.INFO, "Responded At - {0}", LocalDateTime.now());
    response.getHeaderNames().iterator().forEachRemaining( name -> LOGGER.log(Level.INFO, "Headers Key: {0}, Value: {1} ", new Object[]{name, request.getHeader(name)}));
    LOGGER.log(Level.INFO, "Status - {0}", response.getStatus());

  }
}
