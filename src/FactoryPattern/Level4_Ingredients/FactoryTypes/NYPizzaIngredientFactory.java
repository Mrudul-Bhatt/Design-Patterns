package FactoryPattern.Level4_Ingredients.FactoryTypes;

import FactoryPattern.Level4_Ingredients.IngredientTypes.*;
import FactoryPattern.Level4_Ingredients.IngredientsRegional.NYIngredients.*;
import FactoryPattern.Level4_Ingredients.IngredientsRegional.NYIngredients.NYVeggies.Garlic;
import FactoryPattern.Level4_Ingredients.IngredientsRegional.NYIngredients.NYVeggies.Mushroom;
import FactoryPattern.Level4_Ingredients.IngredientsRegional.NYIngredients.NYVeggies.Onion;
import FactoryPattern.Level4_Ingredients.IngredientsRegional.NYIngredients.NYVeggies.RedPepper;
import FactoryPattern.Level4_Ingredients.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
