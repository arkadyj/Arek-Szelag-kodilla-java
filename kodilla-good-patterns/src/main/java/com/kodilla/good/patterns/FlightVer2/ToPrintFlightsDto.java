package com.kodilla.good.patterns.FlightVer2;

import java.util.List;
import java.util.Set;

public class ToPrintFlightsDto {

    private List<Set<Flight>> listOfFlightSet;
    private Set<Flight> temporarySet;
    private String airportNameDeparture;
    private String airportNameArrival;
    private String airportNameThrough;

    public ToPrintFlightsDto(List<Set<Flight>> listOfFlightSet, Set<Flight> temporarySet, String airportNameDeparture, String airportNameArrival, String airportNameThrough) {
        this.listOfFlightSet = listOfFlightSet;
        this.temporarySet = temporarySet;
        this.airportNameDeparture = airportNameDeparture;
        this.airportNameArrival = airportNameArrival;
        this.airportNameThrough = airportNameThrough;
    }

    public List<Set<Flight>> getListOfFlightSet() {
        return listOfFlightSet;
    }

    public Set<Flight> getTemporarySet() {
        return temporarySet;
    }

    public String getAirportNameDeparture() {
        return airportNameDeparture;
    }

    public String getAirportNameArrival() {
        return airportNameArrival;
    }

    public String getAirportNameThrough() {
        return airportNameThrough;
    }
}
