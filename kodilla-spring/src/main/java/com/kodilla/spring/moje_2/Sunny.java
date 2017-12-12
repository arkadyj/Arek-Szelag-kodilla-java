package com.kodilla.spring.moje_2;

import org.springframework.stereotype.Component;


public class Sunny implements Weather {

    public String getForcast() {
        return "Its sunny";
    }
}
