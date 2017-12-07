package com.kodilla.good.patterns.FlightVer2;

    public class FlightFindRequestRetriver {

        public FindFlightRequest retrive() {

            Airlane airlane = new Airlane("LOT");

            return new FindFlightRequest(airlane,"Warszawa",null,null);
        }
}
