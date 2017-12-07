package com.kodilla.good.patterns.FlightVer2;

import java.util.Set;

public class AirlaneData implements RepositoryService {

    public Set<Flight> loadAirlaneData(Airlane airlane) {
        return airlane.getFlightMap();
    }
}
