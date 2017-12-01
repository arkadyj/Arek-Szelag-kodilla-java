package com.kodilla.good.patterns.Flights;

public class FlightMap {

    private String arrival;
    private String departure;

    public FlightMap( String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightMap flightMap = (FlightMap) o;

        if (!arrival.equals(flightMap.arrival)) return false;
        return departure.equals(flightMap.departure);
    }

    @Override
    public int hashCode() {
        int result = arrival.hashCode();
        result = 31 * result + departure.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return " departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'';
    }
}

