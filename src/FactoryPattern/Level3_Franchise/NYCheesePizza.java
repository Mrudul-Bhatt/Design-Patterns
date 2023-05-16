package FactoryPattern.Level3_Franchise;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Style Sauce & Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
