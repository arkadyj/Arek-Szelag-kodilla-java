package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Set;


public class Continent {
    private final String name;
    private final Set<Country> countryList = new HashSet<>();

    public Continent(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Country> getCountry() {
        return countryList;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return name.equals(continent.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
