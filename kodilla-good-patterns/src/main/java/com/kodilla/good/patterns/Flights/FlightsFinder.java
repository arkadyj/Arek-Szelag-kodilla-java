package com.kodilla.good.patterns.Flights;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFinder {

    public void findArrival(Set<Flight> flightSet, String arrivalAirport) {
        System.out.println("\nFLIGHTS TO " + arrivalAirport);
        flightSet.stream()
                .filter(flight -> flight.getFlightMap().getArrival().equals(arrivalAirport))
                .filter((flight -> flight.getArrivalTime().isAfter(LocalDateTime.now())))
                .forEach(System.out::println);

        System.out.println("########################################################");
    }

    public void findDeparture(Set<Flight> flightSet, String departureAirport) {
        System.out.println("\nFLIGHTS FROM " + departureAirport);
        flightSet.stream()
                .filter(flightMap -> flightMap.getFlightMap().getDeparture().equals(departureAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .forEach(System.out::println);

        System.out.println("########################################################");
    }

    public void findFlightAnotherCity(Set<Flight> flightSet, String from, String through, String to) {

        System.out.println("\nFlights with change airport. From " + from + " through " + through + " to " + to + ":");
        Set<Flight> setFirstPart = flightSet.stream()
                .filter(flightMap -> flightMap.getFlightMap().equals(new FlightMap(from, through)))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toSet());

        for (Flight secondFlight : setFirstPart) {
            Set<Flight> setSecondPart = flightSet.stream()
                    .filter(flight -> flight.getFlightMap().equals(new FlightMap(through, to)))
                    .filter(flight -> secondFlight.getDepartureTime().isBefore(flight.getArrivalTime()))
                    .collect(Collectors.toSet());

            if (setSecondPart.size() > 0) {
                System.out.println("CONNECTION:  ");
                System.out.println("First part: " + from + " - " + through + " \n" + secondFlight + " \n \npossible connections: ");
                for (Flight printFlight : setSecondPart) {
                    System.out.println(printFlight);
                }
            }
            System.out.println("\n");
        }
        System.out.println("########################################################");
    }
}
