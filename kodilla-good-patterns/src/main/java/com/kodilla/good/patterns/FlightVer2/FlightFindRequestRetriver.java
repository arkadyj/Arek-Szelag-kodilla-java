package com.kodilla.good.patterns.FlightVer2;

    public class FlightFindRequestRetriver {

        Airlane airlane = new Airlane("LOT");

        public FindFlightRequest retrieveDeparture() {



            return new FindFlightRequest(airlane,"Warsaw",null,null);
        }

        public FindFlightRequest retrieveArrival() {


            return new FindFlightRequest(airlane,null,"Berlin",null);
        }
}
