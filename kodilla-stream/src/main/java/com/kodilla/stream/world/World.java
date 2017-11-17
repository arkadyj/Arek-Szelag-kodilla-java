package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private final Set<Continent> continents = new HashSet<>();

    public World() {

    }

    public void addContinent(Continent conti) {
        continents.add(conti);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountry().stream())
                .map(country -> country.getQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
