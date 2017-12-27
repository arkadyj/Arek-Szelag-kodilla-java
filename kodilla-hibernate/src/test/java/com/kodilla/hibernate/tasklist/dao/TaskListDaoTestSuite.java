package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("In progress", "Task list contains in progress tasks");

        //When
        taskListDao.save(taskList);
        List<TaskList> resultList =gi taskListDao.findByListName("In progress");
        String description = resultList.get(0).getDescription();

        //Then
        Assert.assertEquals(1, resultList.size());
        Assert.assertEquals("Task list contains in progress tasks", description);

        //Cleaning
        int id = resultList.get(0).getId();
        taskListDao.delete(id);
    }
}
