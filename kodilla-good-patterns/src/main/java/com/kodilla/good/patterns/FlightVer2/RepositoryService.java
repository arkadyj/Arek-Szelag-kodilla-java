package com.kodilla.good.patterns.FlightVer2;

import java.util.Set;

public interface RepositoryService {

    Set<Flight> loadAirlaneData(AirlaneData airlaneData);
}
