package com.kodilla.good.patterns.Flights;

import java.util.Set;

public class FlightFindThroughRequestDto {

    private Set<Flight> flightsSet;
    private String airportFrom;
    private String airportThrough;
    private String airportTo;

    public FlightFindThroughRequestDto(Set<Flight> flightsSet, String airportFrom, String airportThrough, String airportTo) {
        this.flightsSet = flightsSet;
        this.airportFrom = airportFrom;
        this.airportThrough = airportThrough;
        this.airportTo = airportTo;
    }

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public String getAirportThrough() {
        return airportThrough;
    }

    public String getAirportTo() {
        return airportTo;
    }
}
