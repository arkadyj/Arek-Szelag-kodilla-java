package com.kodilla.spring.moje_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherConf {

    @Bean
    Weather createWeather( Sunny sunny){
        return new Weather(sunny);
    }

    @Bean
    Sunny createSunny() {
        return new Sunny(true);
    }


}
