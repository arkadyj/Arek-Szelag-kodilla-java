package com.kodilla.good.patterns.FlightVer2;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Airlane {

    private String airlaneName;
    private Set<Flight> flightMap = new HashSet<>();

    public Airlane(String airlaneName) {
        this.airlaneName = airlaneName;
        importFlightData();
    }


    public void importFlightData() {

        flightMap.add(new Flight("AC201",
                LocalDateTime.of(2017, 12, 9, 8, 0),
                LocalDateTime.of(2017, 12, 9, 11, 20),
                "Warsaw", "Berlin"));

        flightMap.add(new Flight("AR331",
                LocalDateTime.of(2017, 12, 28, 12, 0),
                LocalDateTime.of(2017, 12, 28, 13, 30),
                "Berlin", "Hamburg"));

        flightMap.add(new Flight("AP381",
                LocalDateTime.of(2017, 12, 28, 9, 10),
                LocalDateTime.of(2017, 12, 28, 12, 25),
                "Berlin", "Hamburg"));

        flightMap.add(new Flight("AC076",
                LocalDateTime.of(2017, 12, 11, 18, 12),
                LocalDateTime.of(2017, 12, 11, 20, 25),
                "Berlin", "Paris"));

        flightMap.add(new Flight("AR256",
                LocalDateTime.of(2017, 12, 13, 15, 40),
                LocalDateTime.of(2017, 12, 13, 17, 20),
                "Warsaw", "Budapest"));
        flightMap.add(new Flight("AC282",
                LocalDateTime.of(2017, 12, 14, 6, 10),
                LocalDateTime.of(2017, 12, 14, 7, 50),
                "Budapest", "Berlin"));

        flightMap.add(new Flight("AC999",
                LocalDateTime.of(2017, 12, 10, 10, 10),
                LocalDateTime.of(2017, 12, 10, 11, 50),
                "Warsaw", "Berlin"));
    }

    public Set<Flight> getFlightMap() {
        return flightMap;
    }

    @Override
    public String toString() {
        return "Airlane{" +
                "airlaneName='" + airlaneName + '\'' +
                ", flightMap=" + flightMap +
                '}';
    }
}
