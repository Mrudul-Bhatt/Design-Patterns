package FactoryPattern.Level4_Ingredients;

import FactoryPattern.Level4_Ingredients.IngredientTypes.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void box() {
        System.out.println("Box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
