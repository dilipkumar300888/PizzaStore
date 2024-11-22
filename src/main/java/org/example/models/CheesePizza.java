package org.example.models;

import org.example.services.PizzaIngredientsFactory;

public class CheesePizza extends Pizza{
    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory)
    {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }
    @Override
    public void prepare() {
        dough = pizzaIngredientsFactory.createDough();
        cheese = pizzaIngredientsFactory.createCheese();
        sauce = pizzaIngredientsFactory.createSauce();
        clams = pizzaIngredientsFactory.createClams();
        pepperoni = pizzaIngredientsFactory.createPepperoni();
        veggies = pizzaIngredientsFactory.createVeggies();

    }
}
