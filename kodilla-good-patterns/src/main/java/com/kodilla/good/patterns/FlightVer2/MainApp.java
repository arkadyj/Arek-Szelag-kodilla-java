package com.kodilla.good.patterns.FlightVer2;

public class MainApp {

    public static void main(String[] args) {


        FlightFindRequestRetriver flightFindRequestRetriver = new FlightFindRequestRetriver();
        FindFlightRequest findFlightRequest = flightFindRequestRetriver.retrieveDeparture();



        FinderProcess finderProcess = new FinderProcess(new Printer(), new AirlaneData());
        finderProcess.findFlightDistributor(findFlightRequest);
        System.out.println("pauza");
        //findFlightRequest = flightFindRequestRetriver.retrieveArrival();
        //FlightFindRequestRetriver flightFindRequestRetriver1 = new FlightFindRequestRetriver();

        //FinderProcess finderProcess1 = new FinderProcess(new Printer(), new AirlaneData());
        FindFlightRequest findFlightRequest1 = flightFindRequestRetriver.retrieveArrival();
        finderProcess.findFlightDistributor(findFlightRequest1);



    }
}
