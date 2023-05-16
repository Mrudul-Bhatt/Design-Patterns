package FactoryPattern.Level2;

public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.pizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        assert pizza != null;

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
