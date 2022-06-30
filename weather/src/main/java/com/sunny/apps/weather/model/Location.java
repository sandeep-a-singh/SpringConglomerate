package com.sunny.apps.weather.model;

import java.time.LocalDateTime;

public class Location {

  private String cityName;
  private GeoLocation geoLocation;
  private String country;
  private LocalDateTime sunrise;
  private LocalDateTime sunset;

  private Location(String cityName, GeoLocation geoLocation, String country,
      LocalDateTime sunrise, LocalDateTime sunset) {
    this.cityName = cityName;
    this.geoLocation = geoLocation;
    this.country = country;
    this.sunrise = sunrise;
    this.sunset = sunset;
  }

  public String getCityName() {
    return cityName;
  }

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  public String getCountry() {
    return country;
  }

  public LocalDateTime getSunrise() {
    return sunrise;
  }

  public LocalDateTime getSunset() {
    return sunset;
  }

  public static class Builder {

    private String cityName;
    private GeoLocation geoLocation;
    private String country;
    private LocalDateTime sunrise;
    private LocalDateTime sunset;

    public Builder setCityName(String cityName) {
      this.cityName = cityName;
      return this;
    }

    public Builder setGeoLocation(GeoLocation geoLocation) {
      this.geoLocation = geoLocation;
      return this;
    }

    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    public Builder setSunrise(LocalDateTime sunrise) {
      this.sunrise = sunrise;
      return this;
    }

    public Builder setSunset(LocalDateTime sunset) {
      this.sunset = sunset;
      return this;
    }

    public Location createLocation() {
      return new Location(cityName, geoLocation, country, sunrise, sunset);
    }
  }
}
