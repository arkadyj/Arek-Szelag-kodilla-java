package com.kodilla.good.patterns.FlightVer2;

import java.util.Set;

public class FindFlightRequest {

    private Airlane airlane;
    private String findDeparture;
    private String findArrival;
    private String findThough;

    public FindFlightRequest(Airlane airlane, String findDeparture, String findArrival, String findThough) {
        this.airlane = airlane;
        this.findDeparture = findDeparture;
        this.findArrival = findArrival;
        this.findThough = findThough;
    }

    public Airlane getAirlane() {
        return airlane;
    }

    public String getFindDeparture() {
        return findDeparture;
    }

    public String getFindArrival() {
        return findArrival;
    }

    public String getFindThough() {
        return findThough;
    }

    @Override
    public String toString() {
        return "FindFlightRequest{" +
                "airlane=" + airlane +
                ", findDeparture='" + findDeparture + '\'' +
                ", findArrival='" + findArrival + '\'' +
                ", findThough='" + findThough + '\'' +
                '}';
    }
}
