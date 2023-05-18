package FactoryPattern.Level4_Ingredients;

import FactoryPattern.Level4_Ingredients.StoreTypes.NYPizzaStore;

public class Customer {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
        System.out.println("Ethan ordered" + nyCheesePizza.getName());

    }
}
