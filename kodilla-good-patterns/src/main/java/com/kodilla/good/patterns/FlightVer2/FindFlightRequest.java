package com.kodilla.good.patterns.FlightVer2;

public class FindFlightRequest {

    private AirlaneData airlaneData;
    private String findDeparture;
    private String findArrival;
    private String findThough;
    private String typeOfInquiry;

    public FindFlightRequest(AirlaneData airlane, String findDeparture, String findArrival, String findThough, String typeOfInquiry) {
        this.airlaneData = airlane;
        this.findDeparture = findDeparture;
        this.findArrival = findArrival;
        this.findThough = findThough;
        this.typeOfInquiry = typeOfInquiry;
    }

    public AirlaneData getAirlaneData() {
        return airlaneData;
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

    public String getTypeOfInquiry() {
        return typeOfInquiry;
    }

    @Override
    public String toString() {
        return "FindFlightRequest{" +
                "airlaneData=" + airlaneData +
                ", findDeparture='" + findDeparture + '\'' +
                ", findArrival='" + findArrival + '\'' +
                ", findThough='" + findThough + '\'' +
                '}';
    }
}
