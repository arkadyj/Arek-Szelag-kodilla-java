package com.kodilla.spring.moje_2;

import org.springframework.stereotype.Component;


public class Rain implements Weather {

    public String getForcast() {
        return "Its rainning";
    }
}
