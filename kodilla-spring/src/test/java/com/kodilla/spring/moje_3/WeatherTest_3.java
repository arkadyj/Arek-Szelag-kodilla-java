package com.kodilla.spring.moje_3;


import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherTest_3 {

    @Test
    public void testSun() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(WeatherConf.class);
        Weather weather = (Weather) context.getBean("createWeather");

        boolean result = weather.getSunny().isSunny();

        Assert.assertEquals(true, result);
    }




}
