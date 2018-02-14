package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaPeperoniCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaSalamiIngredient(pizzaOrder);
        pizzaOrder = new PizzaOnionIngredient(pizzaOrder);
        //When
        BigDecimal totalCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(20.00), totalCost);
    }

    @Test
    public void testPizzaPeperoniIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaSalamiIngredient(pizzaOrder);
        pizzaOrder = new PizzaOnionIngredient(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("mushrooms - sauce - cheese- peperoni - onion ", ingredients);
    }

    @Test
    public void testPizzaCapriciosaCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaHamIngredient(pizzaOrder);
        pizzaOrder = new PizzaExtraCheeseIngredient(pizzaOrder);
        //When
        BigDecimal totalCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(21.00), totalCost);
    }

    @Test
    public void testPizzaCapriciosaIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaHamIngredient(pizzaOrder);
        pizzaOrder = new PizzaExtraCheeseIngredient(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("mushrooms - sauce - cheese- ham - extra cheese ", ingredients);
    }

    @Test
    public void pizzaAllIngredientsCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaOlivesIngredient(pizzaOrder);
        pizzaOrder = new PizzaOnionIngredient(pizzaOrder);
        pizzaOrder = new PizzaHamIngredient(pizzaOrder);
        pizzaOrder = new PizzaExtraCheeseIngredient(pizzaOrder);
        pizzaOrder = new PizzaSalamiIngredient(pizzaOrder);
        pizzaOrder = new PizzaPeperoniIngredient(pizzaOrder);
        pizzaOrder = new PizzaPineappleIngredient(pizzaOrder);
        pizzaOrder = new PizzaLargeSize(pizzaOrder);
        //When
        BigDecimal totalCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(48.00), totalCost);
    }

    @Test
    public void pizzaAllIngredientsIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaOlivesIngredient(pizzaOrder);
        pizzaOrder = new PizzaOnionIngredient(pizzaOrder);
        pizzaOrder = new PizzaHamIngredient(pizzaOrder);
        pizzaOrder = new PizzaExtraCheeseIngredient(pizzaOrder);
        pizzaOrder = new PizzaSalamiIngredient(pizzaOrder);
        pizzaOrder = new PizzaPeperoniIngredient(pizzaOrder);
        pizzaOrder = new PizzaPineappleIngredient(pizzaOrder);
        pizzaOrder = new PizzaLargeSize(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("mushrooms - sauce - cheese- olives - onion - ham - extra cheese - peperoni - peperoni - pineapple - large size ", ingredients);
    }
}
