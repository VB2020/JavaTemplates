package com.VB2020.Strategy;

public class Weather {
    WeatherActivity weatherActivity;

    public void setWeatherActivity(WeatherActivity weatherActivity) {
        this.weatherActivity = weatherActivity;
    }

    public void executeActivity()
    {
        weatherActivity.makeWeather();
    }


}
