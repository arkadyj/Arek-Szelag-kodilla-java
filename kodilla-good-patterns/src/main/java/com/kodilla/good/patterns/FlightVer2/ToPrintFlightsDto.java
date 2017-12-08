package com.kodilla.good.patterns.FlightVer2;

import java.util.Set;

public class ToPrintFlightsDto {


        private Set<Flight> temporarySet;
        private String airportName;

        public ToPrintFlightsDto(Set<Flight> temporarySet, String airportName) {
            this.temporarySet = temporarySet;
            this.airportName = airportName;
        }

        public Set<Flight> getTemporarySet() {
            return temporarySet;
        }

        public String getAirportName() {
            return airportName;
        }
    }
