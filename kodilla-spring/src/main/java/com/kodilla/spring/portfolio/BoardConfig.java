package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

<<<<<<< HEAD

=======
>>>>>>> zad_10_3
    @Bean
    public Board createBoard(TaskList taskList) {
        return new Board(createTask(), createTask(), createTask());
    }

    @Bean
    @Scope("prototype")
    public TaskList createTask() {
        return new TaskList();
    }


}
