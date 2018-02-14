package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaExtraCheeseIngredient extends AbstractPizzaOrderDecorator {

    public PizzaExtraCheeseIngredient(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "- extra cheese ";
    }
}
