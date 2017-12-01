package com.kodilla.good.patterns.Flights;

import java.time.LocalDateTime;
import java.util.Set;

public class FlightsFinder {
    public void findArrival(Set<Flight> flightSet, String arrivalAirport) {
        System.out.println("\nFlights to " +arrivalAirport);
        flightSet.stream()
                .filter(flight -> flight.getFlightMap().getArrival().equals(arrivalAirport))
                .filter((flight -> flight.getArrivalTime().isAfter(LocalDateTime.now())))
                .forEach(System.out::println);


    }

    public void findDeparture(Set<Flight> flightSet, String departureAirport) {
        System.out.println("\nFlights from " +departureAirport);
        flightSet.stream()
                .filter(flightMap -> flightMap.getFlightMap().getDeparture().equals(departureAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .forEach(System.out::println);

    }

    public void findFlightAnotherCity(Set<Flight> flightSet, String from, String through, String to) {
        System.out.println("\nFlights with change airport. From " + from + " through " + through + " to " + to +":" );
        FlightMap flightMap1 = new FlightMap(from,through);
        FlightMap flightMap2 = new FlightMap(through,to);

        flightSet.stream()
                .filter(flight -> flight.getFlightMap().equals(flightMap1) || flight.getFlightMap().equals(flightMap2))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .forEach(System.out::println);
    }

}
