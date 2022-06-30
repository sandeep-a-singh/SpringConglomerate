package com.sunny.apps.weather.model;

public class GeoLocation {

  private Integer geoCode;
  private Double latitude;
  private Double longitude;

  public GeoLocation(Integer geoCode, Double latitude, Double longitude) {
    this.geoCode = geoCode;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public Integer getGeoCode() {
    return geoCode;
  }

  public Double getLatitude() {
    return latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

}
