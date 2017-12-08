package com.kodilla.good.patterns.FlightVer2;

public class MainApp {

    public static void main(String[] args) {

        FlightFindRequestRetriver flightFindRequestRetriver = new FlightFindRequestRetriver();
        FinderProcess finderProcess = new FinderProcess(new Printer(), new AirlaneRepositoryData());

        FindFlightRequest findFlightRequest = flightFindRequestRetriver.retrieveDeparture();
        finderProcess.findFlightDistributor(findFlightRequest);

        findFlightRequest = flightFindRequestRetriver.retrieveArrival();
        finderProcess.findFlightDistributor(findFlightRequest);

        findFlightRequest = flightFindRequestRetriver.retrieveThrough();
        finderProcess.findFlightDistributor(findFlightRequest);
    }
}
