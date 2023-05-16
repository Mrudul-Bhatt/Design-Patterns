package FactoryPattern.Level3_Franchise;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Cheese")) return new NYCheesePizza();
        else return null;
    }
}
