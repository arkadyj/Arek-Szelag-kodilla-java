package com.kodilla.spring.moje_2;

import org.springframework.stereotype.Component;


public class WeatherMain {


    Weather weather;

    public WeatherMain(Weather weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather.getForcast();
    }
}
