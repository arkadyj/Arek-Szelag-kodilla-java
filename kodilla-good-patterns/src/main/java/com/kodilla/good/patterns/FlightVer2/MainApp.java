package com.kodilla.good.patterns.FlightVer2;

public class MainApp {

    public static void main(String[] args) {
        FinderProcess finderProcess = new FinderProcess(new Printer(), new AirlaneData());
        finderProcess.findFlight();



    }
}
