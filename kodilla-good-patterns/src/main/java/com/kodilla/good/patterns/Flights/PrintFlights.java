package com.kodilla.good.patterns.Flights;

import java.time.format.DateTimeFormatter;
import java.util.*;

public class PrintFlights {

    private DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

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
            System.out.println("###### Possible connection: ");
            for (Flight flight : set) {
                System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getFlightMap().getDeparture(),
                        flight.getFlightMap().getArrival(), flight.getDepartureTime().format(dataTimeFormat),
                        flight.getArrivalTime().format(dataTimeFormat));
            }
        }
    }
}
