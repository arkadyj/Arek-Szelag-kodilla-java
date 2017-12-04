package com.kodilla.good.patterns.Flights;

public class FlightFindRequest {

    private Airlane airlane;

    public FlightFindRequest(Airlane airlane) {
        this.airlane = airlane;
    }

    public FlightFindRequestDto flightFromRequest() {
        return new FlightFindRequestDto(airlane.getFlightsMap(), "Warsaw");
    }

    public FlightFindRequestDto flightToRequest() {
        return new FlightFindRequestDto(airlane.getFlightsMap(), "Berlin");
    }

    public FlightFindThroughRequestDto flightThroughRequest() {
        return new FlightFindThroughRequestDto(airlane.getFlightsMap(), "Warsaw", "Berlin", "Hamburg");
    }
}
