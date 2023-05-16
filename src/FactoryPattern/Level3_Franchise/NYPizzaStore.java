package FactoryPattern.Level3_Franchise;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Cheese")) return new ChicagoCheesePizza();
        else return null;
    }
}
