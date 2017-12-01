package com.kodilla.good.patterns.Flights;

public class AppMain {

    public static void main(String[] args) {
        DataFeeder dataFeeder = new DataFeeder();
        AirlaneData airlaneData = new AirlaneData("New Hope AirLine");

        dataFeeder.flightBuilder(airlaneData.getFlightsMap());
        FlightsFinder flightsFinder = new FlightsFinder();

        flightsFinder.findDeparture(airlaneData.getFlightsMap(),"Warszawa");
        flightsFinder.findArrival(airlaneData.getFlightsMap(),"Hamburg");
        flightsFinder.findFlightAnotherCity(airlaneData.getFlightsMap(),"Warszawa", "Berlin", "Hamburg");

    }




}
