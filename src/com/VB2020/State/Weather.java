package com.VB2020.State;

public class Weather {
    WeatherActivity weatherActivity;

    public void setWeatherActivity(WeatherActivity weatherActivity) {
        this.weatherActivity = weatherActivity;
    }

    public void changeWeatherActivity()
    {
        if (weatherActivity instanceof GroundShaking)
        {
            setWeatherActivity(new Raining());
        }
        else if (weatherActivity instanceof Snowing)
        {
            setWeatherActivity(new Shining());
        }
        else if (weatherActivity instanceof Raining)
        {
            setWeatherActivity(new Shining());
        }
        else if (weatherActivity instanceof Shining)
        {
            setWeatherActivity(new GroundShaking());
        }
    }

    public void makeWeather()
    {
        weatherActivity.makeWeather();
    }
}
