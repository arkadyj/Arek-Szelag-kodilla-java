package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLogTest() {

        //Given

        //When
        Logger.getInstance().log("Błędy\t12.12.2017 17:25:46\tDistributedCOM\t10016\tBrak");
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Błędy\t12.12.2017 17:25:46\tDistributedCOM\t10016\tBrak",result);
    }
}
