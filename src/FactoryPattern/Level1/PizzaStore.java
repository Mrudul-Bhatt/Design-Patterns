package FactoryPattern.Level1;

public class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Cheese")) pizza = new CheesePizza();
        else if (type.equals("Veggie")) pizza = new VeggiePizza();

        assert pizza != null;

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
