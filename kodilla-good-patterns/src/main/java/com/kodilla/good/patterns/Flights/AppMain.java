package com.kodilla.good.patterns.Flights;

public class AppMain {

    public static void main(String[] args) {
        DataFeeder dataFeeder = new DataFeeder();
        AirlaneData airlaneData = new AirlaneData("New Hope AirLine");

        dataFeeder.flightBuilder(airlaneData.getFlightsMap());
        FlightsFinder flightsFinder = new FlightsFinder();

        flightsFinder.findDeparture(airlaneData.getFlightsMap(),"Warsaw");
        flightsFinder.findArrival(airlaneData.getFlightsMap(),"Hamburg");
        flightsFinder.findFlightAnotherCity(airlaneData.getFlightsMap(),"Warsaw", "Berlin", "Hamburg");
        flightsFinder.findFlightAnotherCity(airlaneData.getFlightsMap(),"Warsaw", "Budapest", "Berlin");
    }
}
