package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaHamIngredient extends AbstractPizzaOrderDecorator {

    public PizzaHamIngredient(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "- ham ";
    }
}
