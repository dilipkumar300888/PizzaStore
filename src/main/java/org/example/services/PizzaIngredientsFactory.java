package org.example.services;

import org.example.models.*;

public interface PizzaIngredientsFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}
