package FactoryPattern.Level3_Franchise;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void box() {
        System.out.println("Box");
    }

    public String getName() {
        return name;
    }
}
