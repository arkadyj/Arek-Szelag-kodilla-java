package com.kodilla.spring.moje;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {



    @Bean
    public CarFactory createRenault(Car car) {
        return new CarFactory(car);
    }

    @Bean
    public Car createCar() {
        return new Car("Renault",5);
    }
}
