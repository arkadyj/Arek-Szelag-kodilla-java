package com.kodilla.good.patterns.Flights;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class PrintFlights {

    private DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private FlightsFinder flightsFinder;
    private FlightFindRequest flightFindRequest;
    private Airlane airlane;

    public PrintFlights() {

    }

  public void printFlightFrom(FlightFromToDto flightFromToDto) {
        System.out.println("******************************");
        System.out.println("All flights FROM " + flightFromToDto.getAirportName());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Flight flight : flightFromToDto.getTemporarySet()) {
            System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getFlightMap().getDeparture(),
                    flight.getFlightMap().getArrival(), flight.getDepartureTime().format(dataTimeFormat),
                    flight.getArrivalTime().format(dataTimeFormat));
        }
    }

    public void printFlightTo(FlightFromToDto flightFromToDto) {
        System.out.println("******************************");
        System.out.println("All flights TO " + flightFromToDto.getAirportName());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Flight flight : flightFromToDto.getTemporarySet()) {
            System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getFlightMap().getDeparture(),
                    flight.getFlightMap().getArrival(), flight.getDepartureTime().format(dataTimeFormat),
                    flight.getArrivalTime().format(dataTimeFormat));
        }
    }

    public void printFlightThroug(FlightThroughDto flightThroughDto) {
        System.out.println("******************************");
        System.out.println("All flights FROM " + flightThroughDto.getAirportNameFrom() +
                " THROUGH " + flightThroughDto.getAirportNameThrough() +
                " TO " + flightThroughDto.getAirportNameTo());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Set<Flight> set : flightThroughDto.getTemporaryList()) {
            Set<Flight> testSet = set.stream()
                    .collect(Collectors.toCollection(()-> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));

            System.out.println("###### Possible connection: ");
            for (Flight flight : testSet) {
                System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getFlightMap().getDeparture(),
                        flight.getFlightMap().getArrival(), flight.getDepartureTime().format(dataTimeFormat),
                        flight.getArrivalTime().format(dataTimeFormat));
            }
        }
    }
}
