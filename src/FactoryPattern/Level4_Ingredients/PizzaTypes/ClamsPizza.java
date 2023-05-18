package FactoryPattern.Level4_Ingredients.PizzaTypes;

import FactoryPattern.Level4_Ingredients.Pizza;
import FactoryPattern.Level4_Ingredients.PizzaIngredientFactory;

public class ClamsPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamsPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setClams(pizzaIngredientFactory.createClams());
    }
}
