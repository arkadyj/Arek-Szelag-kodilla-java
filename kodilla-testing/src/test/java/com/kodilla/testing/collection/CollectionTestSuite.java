package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
private   OddNumbersExterminator oddNumbersExterminator;
    @Before
    public void before() {
        oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Beginning test");
    }

    @After
    public void after(){
        System.out.println("End test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){

        ArrayList<Integer> lista = new ArrayList<>();
        //oddNumbersExterminator.exterminate(lista);
        System.out.println("Testing empty list");

        //lepiej sprawdzić coś bardziej sensownego, czy nie jest nullem, i czy jest pusta, itp
        Assert.assertTrue(oddNumbersExterminator.exterminate(lista).size()==0 && oddNumbersExterminator.exterminate(lista)!=null);


    }

    @Test
    public void testOddNumbersExterminatorNormalList () {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaEven = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<100; i++) {
            //rand to nie jest dobry pomysł

            // zmodyfikowałem sposób generowania liczb do list. 50 liczb jest parzysta, 50 nieparzysta
            if (i % 2 == 0) {
                lista.add(((rand.nextInt(20) + 1) * 2) + 1);
            }
            else
            {
                lista.add((rand.nextInt(20) + 1) * 2);
                listaEven.add(lista.get(i));
            }
        }

        System.out.println("Testing filled list");

        //Po co sprawdzasz jakiego jest typu skoro to jest ustawione w definicji metody?
        //Skoro to test pozytywnego przyapdku to powinieneś sprawdzać czy zostały usunięte odpowiedznie liczby,
        //tzn stworzyć kolekcje z usuniętymi i porównać z tym co zwróci metoda
        //Assert.assertTrue(oddNumbersExterminator.exterminate(lista) instanceof List);
        Assert.assertEquals(listaEven,oddNumbersExterminator.exterminate(lista));


    }

    //zaimplementuj pod ten przypadek testowy
    //i dokończ assercje
    @Test
    public void testNull() throws Exception {
        oddNumbersExterminator.exterminate(null);

        System.out.println("Testing null as list");
        //Assert.assertEquals(null,oddNumbersExterminator.exterminate(null));
        Assert.assertNull(oddNumbersExterminator.exterminate(null));
    }
}
