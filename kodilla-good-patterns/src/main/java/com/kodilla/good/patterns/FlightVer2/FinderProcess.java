package com.kodilla.good.patterns.FlightVer2;

public class FinderProcess {

    private PrintService printService;
    private RepositoryService repositoryService;

    public FinderProcess(PrintService printService, RepositoryService repositoryService) {
        this.printService = printService;
        this.repositoryService = repositoryService;
    }

    public void findFlight(FindFlightRequest findFlightRequest) {
        repositoryService.loadAirlaneData(findFlightRequest.getAirlane());

        System.out.println("Finding flight process");
        printService.printFlight();
    }
}
