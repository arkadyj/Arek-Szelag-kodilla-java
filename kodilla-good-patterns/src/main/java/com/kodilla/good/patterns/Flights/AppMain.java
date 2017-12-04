package com.kodilla.good.patterns.Flights;

public class AppMain {

    public static void main(String[] args) {


        FlightsFinder flightsFinder = new FlightsFinder();
        PrintFlights printFlights = new PrintFlights();
        Airlane lot = new Airlane("New Hope AirLine");
        FlightFindRequest flightFindRequest = new FlightFindRequest(lot);

        printFlights.printFlightFrom(flightsFinder.findDeparture(flightFindRequest.flightFromRequest()));
        printFlights.printFlightTo(flightsFinder.findArrival(flightFindRequest.flightToRequest()));
        printFlights.printFlightThroug(flightsFinder.findFlightAnotherCity(flightFindRequest.flightThroughRequest()));
    }
}
