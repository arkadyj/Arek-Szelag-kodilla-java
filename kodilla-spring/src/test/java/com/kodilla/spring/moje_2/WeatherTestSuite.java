package com.kodilla.spring.moje_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherTestSuite {


    @Test
    public void test1() {

        //Given

        WeatherMain weatherMain = new WeatherMain(new Sunny());

        Weather weather =new Rain();

        //Then
        System.out.println(weather.getForcast());
        System.out.println(weatherMain.getWeather());

    }
}
