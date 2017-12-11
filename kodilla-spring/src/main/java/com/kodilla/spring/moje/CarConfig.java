package com.kodilla.spring.moje;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {


    @Bean
    public CarFactory createRenault() {
        return new CarFactory(createCar());
    }

    @Bean
    public Car createCar() {
        return new Car("CarFactory",5);
    }
}
