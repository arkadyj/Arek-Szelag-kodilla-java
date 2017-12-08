package com.kodilla.good.patterns.FlightVer2;

public class FlightFindRequestRetriver {

    AirlaneData airlaneData = new AirlaneData("LOT");

    public FindFlightRequest retrieveDeparture() {

        return new FindFlightRequest(airlaneData, "Warsaw", null, null, "FROM");
    }

    public FindFlightRequest retrieveArrival() {

        return new FindFlightRequest(airlaneData, null, "Berlin", null, "TO");
    }

    public FindFlightRequest retrieveThrough() {

        return new FindFlightRequest(airlaneData, "Warsaw", "Hamburg", "Berlin", "THROUGH");
    }
}
