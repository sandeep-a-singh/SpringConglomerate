package com.sunny.apps.weather.dao;

import com.sunny.apps.weather.converter.RapidAPIResponseToWeatherResultConverter;
import com.sunny.apps.weather.dto.RapidAPIResponse;
import com.sunny.apps.weather.model.WeatherResult;
import net.logstash.logback.argument.StructuredArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherDao {
  private static final Logger LOGGER = LoggerFactory.getLogger(WeatherDao.class);

  @Value("${weather.rapid.api.key}")
  String key;

  @Value("${weather.rapid.api.host}")
  String host;

  private final RestTemplate rapidAPITemplate;
  private final RapidAPIResponseToWeatherResultConverter converter = new RapidAPIResponseToWeatherResultConverter();

  public WeatherDao(RestTemplate rapidAPITemplate) {
    this.rapidAPITemplate = rapidAPITemplate;
  }

  public WeatherResult getWeatherByCity(String city) {

    HttpHeaders headers = new HttpHeaders();
    headers.add("X-RapidAPI-Host", host);
    headers.add("X-RapidAPI-Key", key);
    HttpEntity<String> entity = new HttpEntity<String>(null, headers);
    LOGGER.info("Requested City ", StructuredArguments.keyValue("City", city));
    ResponseEntity<RapidAPIResponse> apiResponse = rapidAPITemplate.exchange("/weather?q=" + city, HttpMethod.GET, entity, RapidAPIResponse.class);

    //RapidAPIResponse apiResponse = rapidAPITemplate.getForObject("/weather?q=" + city, RapidAPIResponse.class);

    return converter.convert(apiResponse.getBody());
  }

}
