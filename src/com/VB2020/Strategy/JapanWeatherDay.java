package com.VB2020.Strategy;

public class JapanWeatherDay {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.setWeatherActivity(new Snowing());
        weather.executeActivity();

        weather.setWeatherActivity(new Shining());
        weather.executeActivity();

        weather.setWeatherActivity(new Raining());
        weather.executeActivity();

        weather.setWeatherActivity(new GroundShaking());
        weather.executeActivity();


    }
}
