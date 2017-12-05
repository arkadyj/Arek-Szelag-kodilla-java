package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(3.5, 4.5);
        double resultSub = calculator.sub(5, 8);
        double resultMul = calculator.mul(5, 8);
        double resultDiv = calculator.div(8, 0);

        //Given
        Assert.assertEquals(8, resultAdd, 0.0);
        Assert.assertEquals(-3, resultSub, 0.0);
        Assert.assertEquals(40, resultMul, 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, resultDiv, 0.0);
    }
}
