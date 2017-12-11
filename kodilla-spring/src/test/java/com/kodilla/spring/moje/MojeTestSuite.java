package com.kodilla.spring.moje;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MojeTestSuite {

    @Test
    public void test1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(CarConfig.class);
        CarFactory carFactory = (CarFactory)context.getBean("createRenault");
        //When


        //Then
        //do nothing
    }
}
