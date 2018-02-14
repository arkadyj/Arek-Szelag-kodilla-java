package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaLargeSize extends AbstractPizzaOrderDecorator {

    public PizzaLargeSize(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "- large size ";
    }
}
