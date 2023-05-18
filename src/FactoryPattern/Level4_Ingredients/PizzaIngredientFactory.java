package FactoryPattern.Level4_Ingredients;

import FactoryPattern.Level4_Ingredients.IngredientTypes.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

}
