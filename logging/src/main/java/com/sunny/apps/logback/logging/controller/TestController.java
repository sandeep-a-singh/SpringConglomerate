package com.sunny.apps.logback.logging.controller;

import com.sunny.apps.logback.logging.dto.PostBody;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private static final Logger LOGGER = Logger.getLogger(TestController.class.getCanonicalName());

  @GetMapping(path = "/log")
  public ResponseEntity getDetails(  HttpServletRequest httpServletRequest) {
    LOGGER.log(Level.ALL,
        "Requested => " + httpServletRequest.getRequestURI() + " By => " + httpServletRequest
            .getRemoteAddr() + " To =>" + httpServletRequest.getServletPath());
    return ResponseEntity.ok(LocalDateTime.now());
  }

  @RequestMapping(path ="/post", method = RequestMethod.POST)
  public ResponseEntity getPostDetails(@RequestBody PostBody postBody) {
    return ResponseEntity.ok(postBody);
  }
}
