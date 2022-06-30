package com.sunny.apps.weather.model;

public class Weather {

  private Double currentTemperature;
  private Double minimumTemperature;
  private Double maximumTemperature;
  private Integer pressure;
  private Integer humidity;

  private Weather(Double currentTemperature, Double minimumTemperature,
      Double maximumTemperature, Integer pressure, Integer humidity) {
    this.currentTemperature = currentTemperature;
    this.minimumTemperature = minimumTemperature;
    this.maximumTemperature = maximumTemperature;
    this.pressure = pressure;
    this.humidity = humidity;
  }

  public Double getCurrentTemperature() {
    return currentTemperature;
  }

  public Double getMinimumTemperature() {
    return minimumTemperature;
  }

  public Double getMaximumTemperature() {
    return maximumTemperature;
  }

  public Integer getPressure() {
    return pressure;
  }

  public Integer getHumidity() {
    return humidity;
  }

  public static class Builder {

    private Double currentTemperature;
    private Double minimumTemperature;
    private Double maximumTemperature;
    private Integer pressure;
    private Integer humidity;

    public Builder setCurrentTemperature(Double currentTemperature) {
      this.currentTemperature = currentTemperature;
      return this;
    }

    public Builder setMinimumTemperature(Double minimumTemperature) {
      this.minimumTemperature = minimumTemperature;
      return this;
    }

    public Builder setMaximumTemperature(Double maximumTemperature) {
      this.maximumTemperature = maximumTemperature;
      return this;
    }

    public Builder setPressure(Integer pressure) {
      this.pressure = pressure;
      return this;
    }

    public Builder setHumidity(Integer humidity) {
      this.humidity = humidity;
      return this;
    }

    public Weather createWeather() {
      return new Weather(currentTemperature, minimumTemperature, maximumTemperature, pressure,
          humidity);
    }
  }
}
