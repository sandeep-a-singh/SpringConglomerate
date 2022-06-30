package com.sunny.apps.weather.model;

public class WeatherResult {
  private Location location;
  private Weather weather;

  public WeatherResult(Location location, Weather weather) {
    this.location = location;
    this.weather = weather;
  }

  public Location getLocation() {
    return location;
  }

  public Weather getWeather() {
    return weather;
  }

}
