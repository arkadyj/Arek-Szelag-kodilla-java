package com.kodilla.good.patterns.FlightVer2;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class FinderProcess {

    private PrintService printService;
    private RepositoryService repositoryService;

    public FinderProcess(PrintService printService, RepositoryService repositoryService) {
        this.printService = printService;
        this.repositoryService = repositoryService;
    }

    public void findFlightDistributor(FindFlightRequest findFlightRequest) {
        if (findFlightRequest.getFindThough()!=null) {
            System.out.println("through is empty");
        } else if (findFlightRequest.getFindArrival()!=null) {
            System.out.println("TAK");
            //findFlightTo(findFlightRequest);
            this.findFlightArrival(findFlightRequest);
        } else {
            System.out.println("NIE");
            this.findFlightDeparture(findFlightRequest);

        }

        //System.out.println(repositoryService.loadAirlaneData(findFlightRequest.getAirlane()));
        //System.out.println(findFlightRequest);
        //System.out.println("Finding flight process");
        //printService.printFlight();
    }

    public void findFlightDeparture (FindFlightRequest findFlightRequest) {

        System.out.println(findFlightRequest);

        Set <Flight> setToPrint = repositoryService.loadAirlaneData(findFlightRequest.getAirlane()).stream()
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .filter(flight -> flight.getDepartureAirport().equals(findFlightRequest.getFindDeparture()))
                .collect(Collectors.toSet());

        System.out.println("Test111");

        //printService.printFlightDeparture(new ToPrintFlightsDto(setToPrint,findFlightRequest.getFindDeparture()));
    }

    public void findFlightArrival (FindFlightRequest findFlightRequest) {

        //System.out.println(findFlightRequest);

        Set <Flight> setToPrint = repositoryService.loadAirlaneData(findFlightRequest.getAirlane()).stream()
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .filter(flight -> flight.getArrivalAirport().equals(findFlightRequest.getFindArrival()))
                .collect(Collectors.toSet());

        System.out.println("Test222");

        System.out.println(setToPrint);

        printService.printFlightArrival(new ToPrintFlightsDto(setToPrint,findFlightRequest.getFindArrival()));
    }
}
