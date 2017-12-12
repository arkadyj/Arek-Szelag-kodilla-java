package com.kodilla.spring.moje_3;

public class Weather {

    private Sunny sunny;

    public Weather(Sunny sunny) {
        this.sunny = sunny;
    }

    public Sunny getSunny() {
        return sunny;
    }
}
