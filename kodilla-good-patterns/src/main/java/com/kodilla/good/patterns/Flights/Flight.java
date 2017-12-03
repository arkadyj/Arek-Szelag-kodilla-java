package com.kodilla.good.patterns.Flights;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight {

    private String flightNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private FlightMap flightMap;
    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Flight(String flightNumber, LocalDateTime departureTime, LocalDateTime arrivalTime, FlightMap flightMap) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightMap = flightMap;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public FlightMap getFlightMap() {
        return flightMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!departureTime.equals(flight.departureTime)) return false;
        if (!arrivalTime.equals(flight.arrivalTime)) return false;
        return flightMap.equals(flight.flightMap);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        result = 31 * result + flightMap.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "  " + flightNumber + "       " +
                flightMap +
                "    " + departureTime.format(dataTimeFormat) +
                " " + arrivalTime.format(dataTimeFormat) +
                "\n";
    }
}
