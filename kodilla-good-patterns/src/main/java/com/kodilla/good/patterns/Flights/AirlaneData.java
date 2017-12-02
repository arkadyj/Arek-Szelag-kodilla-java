package com.kodilla.good.patterns.Flights;

import java.util.HashSet;
import java.util.Set;

public class AirlaneData {

    private Set<Flight> flightsMap;
    private String airlaneName;

    public AirlaneData(String airlaneName) {
        this.airlaneName = airlaneName;
        flightsMap = new HashSet<>();
    }

    public Set<Flight> getFlightsMap() {
        return flightsMap;
    }
}
