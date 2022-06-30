package com.sunny.apps.weather.service;

import com.sunny.apps.weather.dao.WeatherDao;
import com.sunny.apps.weather.model.WeatherResult;
import net.logstash.logback.argument.StructuredArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherService {

  private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

  @Autowired
  WeatherDao weatherDao;

  public WeatherResult getWeather(String city) {
    if (city == null || city.trim() == "") {
      LOGGER.warn("Empty String Received {}", StructuredArguments.keyValue("City", ""));
      throw new RuntimeException("Empty City Name");
    }
    return weatherDao.getWeatherByCity(city);
  }

}
