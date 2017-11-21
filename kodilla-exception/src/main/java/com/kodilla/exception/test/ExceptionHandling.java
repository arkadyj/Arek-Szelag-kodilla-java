package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{


    public static void exceptionHandling(SecondChallenge secondChallenge) {

        try {
            secondChallenge.probablyIWillThrowException(3.5, 7.5);
        } catch (Exception e) {
            System.out.println("Remember x must be smaller than 2 and grater than 1 and y must be different from 1.5");
        } finally {
            System.out.println("Write here a code you want to always run");
        }
    }


}
