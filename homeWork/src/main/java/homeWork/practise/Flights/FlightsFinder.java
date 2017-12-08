package com.kodilla.good.patterns.Flights;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class FlightsFinder {

    public FlightsFinder() {
    }


    public FlightFromToDto findArrival(FlightFindRequestDto flightFindRequestDto) {

        Set<Flight> result = flightFindRequestDto.getFlightsSet().stream()
                .filter(flight -> flight.getFlightMap().getArrival().equals(flightFindRequestDto.getAirport()))
                .filter((flight -> flight.getArrivalTime().isAfter(LocalDateTime.now())))
                .collect(Collectors.toCollection(()-> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));
        return new FlightFromToDto(result, flightFindRequestDto.getAirport());
    }

    public FlightFromToDto findDeparture(FlightFindRequestDto flightFromRequestDto) {

        Set<Flight> result = flightFromRequestDto.getFlightsSet().stream()
                .filter(flightMap -> flightMap.getFlightMap().getDeparture().equals(flightFromRequestDto.getAirport()))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toCollection(()-> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));
        return new FlightFromToDto(result, flightFromRequestDto.getAirport());
    }

    public FlightThroughDto findFlightAnotherCity(FlightFindThroughRequestDto flightFindThroughRequestDto) {

        Set<Flight> finalOfSet = new HashSet<>();
        List<Set<Flight>> listToPrint = new ArrayList<>();
        Set<Flight> setFirstPart = flightFindThroughRequestDto.getFlightsSet().stream()
                .filter(flightMap -> flightMap.getFlightMap().equals(new FlightMap(flightFindThroughRequestDto.getAirportFrom(), flightFindThroughRequestDto.getAirportThrough())))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toCollection(()-> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));

        for (Flight secondFlight : setFirstPart) {
            finalOfSet.add(secondFlight);
            Set<Flight> setSecondPart = flightFindThroughRequestDto.getFlightsSet().stream()
                    .filter(flight -> flight.getFlightMap().equals(new FlightMap(flightFindThroughRequestDto.getAirportThrough(), flightFindThroughRequestDto.getAirportTo())))
                    .filter(flight -> secondFlight.getDepartureTime().isBefore(flight.getArrivalTime()))
                    .collect(Collectors.toSet());

            if (setFirstPart.size() > 0 && setSecondPart.size() > 0) {

                finalOfSet.addAll(setSecondPart);
                listToPrint.add(finalOfSet);
                finalOfSet = new HashSet<>();
            }
        }
        return new FlightThroughDto(listToPrint, flightFindThroughRequestDto.getAirportFrom(), flightFindThroughRequestDto.getAirportTo(), flightFindThroughRequestDto.getAirportThrough());
    }
}
