package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSalamiIngredient extends AbstractPizzaOrderDecorator {
    public PizzaSalamiIngredient(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "- peperoni ";
    }
}
