package FactoryPattern.Level4_Ingredients.StoreTypes;

import FactoryPattern.Level4_Ingredients.FactoryTypes.NYPizzaIngredientFactory;
import FactoryPattern.Level4_Ingredients.Pizza;
import FactoryPattern.Level4_Ingredients.PizzaIngredientFactory;
import FactoryPattern.Level4_Ingredients.PizzaStore;
import FactoryPattern.Level4_Ingredients.PizzaTypes.CheesePizza;
import FactoryPattern.Level4_Ingredients.PizzaTypes.ClamsPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Cheese Pizza");
        } else if (type.equals("Clams")) {
            pizza = new ClamsPizza(pizzaIngredientFactory);
            pizza.setName("NY Clams Pizza");
        }

        return pizza;
    }
}
