package com.kodilla.good.patterns.FlightVer2;

import java.util.Set;

public class AirlaneRepositoryData implements RepositoryService {

    public Set<Flight> loadAirlaneData(AirlaneData airlaneData) {
        return airlaneData.getFlightMap();
    }
}
