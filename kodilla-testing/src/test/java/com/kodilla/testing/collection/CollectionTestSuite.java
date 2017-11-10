package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Assert;

import java.util.*;

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
        //given
        ArrayList<Integer> input = new ArrayList<>();
        System.out.println("Testing empty list");
        //when
        List<Integer> output = oddNumbersExterminator.exterminate(input);
        //then
        Assert.assertEquals("List not empty",0,output.size());
    }

    //Trzymaj się konwencji given-when-then!!!
    @Test
    public void testOddNumbersExterminatorNormalList () {
        // dane to testcasów powinny takie same za każdym razem
        //given
        List<Integer> input= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> assertArray= Arrays.asList(2,4,6,8,10);
//        ArrayList<Integer> lista = new ArrayList<>();
//        ArrayList<Integer> listaEven = new ArrayList<>();
//        Random rand = new Random();                            //cześć z generowaniem losowych danych jest złym pomysłem
//        for (int i=0; i<10; i++) {
//            if (i % 2 == 0) {

//                lista.add(((rand.nextInt(20) + 1) * 2) + 1);
//            }
//            else
//            {
//                lista.add((rand.nextInt(20) + 1) * 2);
//                listaEven.add(lista.get(i));
//            }
//        }
        //when
        List<Integer> output=oddNumbersExterminator.exterminate(input);
        System.out.println("Testing filled list");

        //then
        Assert.assertTrue(assertArray.equals(output));


    }

    //zaimplementuj pod ten przypadek testowy
    //i dokończ assercje
    @Test
    public void testNull() throws Exception {
       //pamietaj o given-when-then

        //given
        List<Integer> input = new ArrayList<>();

        //when
        List<Integer> output = oddNumbersExterminator.exterminate(null);
        System.out.println("Testing null as list");



        //metoda nie powinna zwracać nulla tylko pustą kolekcje keidy otrzyma obiekt który ma w sobie nulla
        //Assert.assertNotNull(oddNumbersExterminator.exterminate(null));
        //then
        Assert.assertEquals(input,output);


    }
}
