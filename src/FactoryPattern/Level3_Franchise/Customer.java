package FactoryPattern.Level3_Franchise;

public class Customer {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
        System.out.println("Ethan ordered" + nyCheesePizza.getName());

        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("Cheese");
        System.out.println("Johnny ordered" + chicagoCheesePizza.getName());

    }
}
