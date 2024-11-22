package org.example.models;


public abstract class Pizza {
    public String name;
    public Dough dough;
    public Cheese cheese;
    public Sauce sauce;
    public Pepperoni pepperoni;
    public Clams clams;
    public Veggie[] veggies;
    public abstract void prepare();
    public void bake() {
        System.out.println("Bake for 25mins");
    }
    public void cut() {
        System.out.println("Cut into 6 pieces");
    }
    public void box() {
        System.out.println("Place it into box");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
