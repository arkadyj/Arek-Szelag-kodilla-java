package com.kodilla.good.patterns.Flights;

import java.util.Set;

public class FlightFromToDto {

    private Set<Flight> temporarySet;
    private String airportName;

    public FlightFromToDto(Set<Flight> temporarySet, String airportName) {
        this.temporarySet = temporarySet;
        this.airportName = airportName;
    }

    public Set<Flight> getTemporarySet() {
        return temporarySet;
    }

    public String getAirportName() {
        return airportName;
    }
}
