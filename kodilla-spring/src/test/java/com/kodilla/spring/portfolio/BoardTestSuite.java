package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("createBoard");

        //When
        board.getInProgressList().addToTask("In progress list");
        String resultInProgressList = board.getInProgressList().getTasks().get(0);

        board.getToDoList().addToTask("To do task list");
        String resultTaskToDO =  board.getToDoList().getTasks().get(0);

        board.getDoneList().addToTask("Done task list");
        String resultDoneList = board.getDoneList().getTasks().get(0);

        //Then
        Assert.assertEquals(resultInProgressList, "In progress list");
        Assert.assertEquals(resultTaskToDO, "To do task list");
        Assert.assertEquals(resultDoneList, "Done task list");
    }
}
