package com.kodilla.good.patterns.Flights;

import java.util.HashSet;
import java.util.Set;

public class Airlane {

    private DataFeeder dataFeeder;
    private Set<Flight> flightsMap = new HashSet<>();
    private String airlaneName;

    public Airlane(String airlaneName) {
        this.dataFeeder = new DataFeeder();
        this.airlaneName = airlaneName;
        flightsMap = dataFeeder.flightBuilder(flightsMap);
    }

    public Set<Flight> getFlightsMap() {
        return flightsMap;
    }

}
