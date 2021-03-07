package com.VB2020.State;

public class JapanWeatherDay {
    public static void main(String[] args) {
        WeatherActivity activity = new Snowing();
        Weather weather = new Weather();
        weather.setWeatherActivity(activity);

        for (int i=0; i<7; i++)
        {
            weather.makeWeather();
            weather.changeWeatherActivity();
        }
    }
}
