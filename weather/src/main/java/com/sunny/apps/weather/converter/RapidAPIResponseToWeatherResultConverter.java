package com.sunny.apps.weather.converter;

import com.sunny.apps.weather.dto.RapidAPIResponse;
import com.sunny.apps.weather.model.GeoLocation;
import com.sunny.apps.weather.model.Location;
import com.sunny.apps.weather.model.Weather;
import com.sunny.apps.weather.model.WeatherResult;

public class RapidAPIResponseToWeatherResultConverter {

  public WeatherResult convert(RapidAPIResponse apiResponse) {

    GeoLocation geoLocation = new GeoLocation(apiResponse.getId(), apiResponse.getCoord().getLat(),
        apiResponse.getCoord().getLon());
    Location location = new Location.Builder()
        .setGeoLocation(geoLocation)
        .setCountry(apiResponse.getSys().getCountry())
        .setCityName(apiResponse.getName())
        .createLocation();

    Weather weather = new Weather.Builder()
        .setHumidity(apiResponse.getMain().getHumidity())
        .setPressure(apiResponse.getMain().getPressure()).createWeather();

    return new WeatherResult(location, weather);
  }
}
