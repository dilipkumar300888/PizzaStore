package org.example.services;

import org.example.models.*;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory{
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }
}
