package com.kodilla.good.patterns.Flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFinder {


    public FlightFromToDto findArrival(Set<Flight> flightSet, String arrivalAirport) {

        Set<Flight> result = flightSet.stream()
                .filter(flight -> flight.getFlightMap().getArrival().equals(arrivalAirport))
                .filter((flight -> flight.getArrivalTime().isAfter(LocalDateTime.now())))
                .collect(Collectors.toSet());
        return new FlightFromToDto(result, arrivalAirport);
    }

    public FlightFromToDto findDeparture(Set<Flight> flightSet, String departureAirport) {

        Set<Flight> result = flightSet.stream()
                .filter(flightMap -> flightMap.getFlightMap().getDeparture().equals(departureAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toSet());
        return new FlightFromToDto(result, departureAirport);
    }

    public FlightThroughDto findFlightAnotherCity(Set<Flight> flightSet, String from, String through, String to) {

        Set<Flight> finalOfSet = new HashSet<>();
        List<Set<Flight>> listToPrint = new ArrayList<>();
        Set<Flight> setFirstPart = flightSet.stream()
                .filter(flightMap -> flightMap.getFlightMap().equals(new FlightMap(from, through)))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toSet());

        for (Flight secondFlight : setFirstPart) {
            finalOfSet.add(secondFlight);
            Set<Flight> setSecondPart = flightSet.stream()
                    .filter(flight -> flight.getFlightMap().equals(new FlightMap(through, to)))
                    .filter(flight -> secondFlight.getDepartureTime().isBefore(flight.getArrivalTime()))
                    .collect(Collectors.toSet());

            if (setFirstPart.size() > 0 && setSecondPart.size() > 0) {

                finalOfSet.addAll(setSecondPart);
                listToPrint.add(finalOfSet);
                finalOfSet = new HashSet<>();
            }
        }
        return new FlightThroughDto(listToPrint, from, to, through);
    }
}
