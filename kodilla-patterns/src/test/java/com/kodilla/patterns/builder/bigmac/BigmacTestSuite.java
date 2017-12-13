package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("with sesame")
                .burgers(2)
                .sauce("standard")
                .ingredients("mushrooms")
                .ingredients("extra cheese")
                .ingredients("ham")
                .ingredients("onion")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int burgersNumber = bigmac.getBurgers();
        String sauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, burgersNumber);
        Assert.assertEquals("standard", sauce);
    }
}
