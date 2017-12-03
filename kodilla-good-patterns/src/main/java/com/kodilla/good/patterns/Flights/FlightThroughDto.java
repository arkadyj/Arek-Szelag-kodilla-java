package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.Set;

public class FlightThroughDto {

    private List<Set<Flight>> temporaryList;
    private String airportNameFrom;
    private String airportNameTo;
    private String airportNameThrough;

    public FlightThroughDto(List<Set<Flight>> temporaryList, String airportNameFrom, String airportNameTo, String airportNameThrough) {
        this.temporaryList = temporaryList;
        this.airportNameFrom = airportNameFrom;
        this.airportNameTo = airportNameTo;
        this.airportNameThrough = airportNameThrough;
    }

    public List<Set<Flight>> getTemporaryList() {
        return temporaryList;
    }

    public String getAirportNameFrom() {
        return airportNameFrom;
    }

    public String getAirportNameTo() {
        return airportNameTo;
    }

    public String getAirportNameThrough() {
        return airportNameThrough;
    }
}
