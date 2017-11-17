package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String name;
    private final BigDecimal quantity;


    public Country(final String name, final BigDecimal quantity) {
        this.name = name;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
