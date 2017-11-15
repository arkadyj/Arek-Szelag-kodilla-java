package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    World world;

    @Before
    public void beforeEveryTest() {
        world = new World();
    }


    @Test
    public void getPeopleQuantity() {

        //Given
        Continent europa = new Continent("Europa");
        Continent northAmerica = new Continent("North America");
        Continent africa = new Continent("Africa");
        world.addContinent(europa);
        world.addContinent(northAmerica);
        world.addContinent(africa);


        //When
        europa.addCountry(new Country("Poland", new BigDecimal("38")));
        europa.addCountry(new Country("Germany", new BigDecimal("82")));
        northAmerica.addCountry(new Country("USA", new BigDecimal("325")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("36")));
        africa.addCountry(new Country("Niger", new BigDecimal("22")));


        //Then
        Assert.assertEquals(new BigDecimal("503"), world.getPeopleQuantity());
        Assert.assertEquals(2, northAmerica.getCountry().size());

    }
}
