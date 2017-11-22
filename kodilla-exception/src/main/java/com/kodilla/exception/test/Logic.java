package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Munchen", true);
        airports.put("Hamburg", true);
        airports.put("Brno", true);

        if (airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())) {
            return true;
        }
        throw new RouteNotFoundException("Arrival airport doesn't exits in flight connection map");

    }


}
