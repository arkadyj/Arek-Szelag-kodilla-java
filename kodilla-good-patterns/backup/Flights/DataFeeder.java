package com.kodilla.good.patterns.Flights;

import java.time.LocalDateTime;
import java.util.Set;

public class DataFeeder {

/*
    public Set<FlightMap> connectionMapBuilder(Set<FlightMap> connectionMap) {

        //TODO czy powinno się stworzyć tymczasowy Set i do niego dopisywać połączenia?
        connectionMap.add(new FlightMap( "Warszawa","Budapeszt"));
        connectionMap.add(new FlightMap( "Krakow","Wroclaw"));
        connectionMap.add(new FlightMap( "Warszawa","Berlin"));
        connectionMap.add(new FlightMap( "Berlin","Hamburg"));
        connectionMap.add(new FlightMap( "Krakow","Paryz"));
        connectionMap.add(new FlightMap( "Paryz","Londyn"));
        connectionMap.add(new FlightMap( "Londyn","Wroclaw"));

        return connectionMap;
    }
*/
    public Set<Flight> flightBuilder (Set<Flight> connectionFlight) {

        connectionFlight.add( new Flight("AC201", "Warszawa", "Berlin",
                LocalDateTime.of(2017,12, 27, 8,00 ),
                LocalDateTime.of(2017,12,27, 11,20),
                ));

        connectionFlight.add( new Flight("AR331", "Berlin", "Hamburg",
                LocalDateTime.of(2017,12, 28, 12,00 ),
                LocalDateTime.of(2017,12,28, 13,30),
                ));

        connectionFlight.add( new Flight("AP381", "Berlin", "Hamburg",
                LocalDateTime.of(2017,12, 28, 9,10 ),
                LocalDateTime.of(2017,12,28, 12,25),
                ));

        connectionFlight.add( new Flight("AC076", "Berlin", "Paris",
                LocalDateTime.of(2017,12, 11, 18,12 ),
                LocalDateTime.of(2017,12,11, 20,25),
                ));

        connectionFlight.add( new Flight("AR256", "Warsaw", "Budapest",
                LocalDateTime.of(2017,12, 13, 15,40 ),
                LocalDateTime.of(2017,12,13, 17,20),
                ));

        connectionFlight.add( new Flight("AC282", "Budapest", "Berlin",
                LocalDateTime.of(2017,12, 14, 6,10 ),
                LocalDateTime.of(2017,12,14, 7,50),
                ));

        return  connectionFlight;
    }
}
