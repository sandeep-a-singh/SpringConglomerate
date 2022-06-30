package com.sunny.apps.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping(consumes = "application/json", method = RequestMethod.POST)
  public ResponseEntity postData() {


    return ResponseEntity.ok().build();
  }



}
