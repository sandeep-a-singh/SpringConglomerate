package com.sunny.apps.weather.controller;

import net.logstash.logback.argument.StructuredArguments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.apps.weather.model.WeatherResult;
import com.sunny.apps.weather.service.WeatherService;

@RestController
@RequestMapping(path = "/weather")
public class WeatherController {

  private static final Logger LOGGER = LoggerFactory.getLogger(WeatherController.class);

  @Autowired
  WeatherService weatherService;

  @GetMapping("/city")
  public ResponseEntity<WeatherResult> getWeather(@RequestParam String city) {
    WeatherResult weatherResult = null;
    try {
      weatherResult = weatherService.getWeather(city);
    } catch (Exception exception) {
      LOGGER.error("Invalid Response for {}", StructuredArguments.keyValue("City", ""), exception);
    }
    return ResponseEntity.ok(weatherResult);
  }

  @ExceptionHandler(RuntimeException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseEntity<String> handleRuntimeException(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
                         .body(exception.getMessage());
  }

}

