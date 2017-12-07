package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean
    public Board createBoard() {
        return new Board(createTask(), createTask(), createTask());
    }

    @Bean
    @Scope("prototype")
    public TaskList createTask() {
        return new TaskList();
    }
}
