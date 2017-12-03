package com.kodilla.good.patterns.Flights;

public class AppMain {

    public static void main(String[] args) {


        FlightsFinder flightsFinder = new FlightsFinder();
        PrintFlights printFlights = new PrintFlights();
        Airlane lot = new Airlane("New Hope AirLine");

        printFlights.printFlightFrom(flightsFinder.findDeparture(lot.getFlightsMap(), "Warsaw"));
        printFlights.printFlightTo(flightsFinder.findArrival(lot.getFlightsMap(), "Berlin"));
        printFlights.printFlightThroug(flightsFinder.findFlightAnotherCity(lot.getFlightsMap(), "Warsaw", "Berlin", "Hamburg"));
    }
}
