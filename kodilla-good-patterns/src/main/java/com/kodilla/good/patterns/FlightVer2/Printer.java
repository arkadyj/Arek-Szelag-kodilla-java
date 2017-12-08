package com.kodilla.good.patterns.FlightVer2;

import java.time.format.DateTimeFormatter;

public class Printer implements PrintService {

    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void printFlightDeparture(ToPrintFlightsDto toPrintFlightsDto) {
        System.out.println("******************************");
        System.out.println("All flights FROM " + toPrintFlightsDto.getAirportName());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Flight flight : toPrintFlightsDto.getTemporarySet()) {
            System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getDepartureAirport(),
                    flight.getArrivalAirport(), flight.getDepartureTime().format(dataTimeFormat),
                    flight.getArrivalTime().format(dataTimeFormat));
        }

    }

    public void printFlightArrival(ToPrintFlightsDto toPrintFlightsDto) {
        System.out.println("******************************");
        System.out.println("All flights FROM " + toPrintFlightsDto.getAirportName());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Flight flight : toPrintFlightsDto.getTemporarySet()) {
            System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getDepartureAirport(),
                    flight.getArrivalAirport(), flight.getDepartureTime().format(dataTimeFormat),
                    flight.getArrivalTime().format(dataTimeFormat));
        }

    }


}
