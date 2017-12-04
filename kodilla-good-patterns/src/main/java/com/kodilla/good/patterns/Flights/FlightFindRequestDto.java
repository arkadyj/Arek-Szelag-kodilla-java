package com.kodilla.good.patterns.Flights;

import java.util.Set;

public class FlightFindRequestDto {

    private Set<Flight> flightsSet;
    private String airport;

    public FlightFindRequestDto(Set<Flight> flightsSet, String airport) {
        this.flightsSet = flightsSet;
        this.airport = airport;
    }

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }

    public String getAirport() {
        return airport;
    }
}
