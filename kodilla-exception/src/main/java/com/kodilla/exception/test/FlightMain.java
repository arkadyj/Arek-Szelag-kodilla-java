package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {
        Logic logic = new Logic();

        try {
            if (logic.findFilght(new Flight("Wroclaw", "Brno"))) {
                System.out.println("We have connections to these airports");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, flight not exists. Arrival or departure airport not exist in our connection map");
        }


    }
}
