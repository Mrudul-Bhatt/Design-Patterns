package TemplatePattern.Level2;

public abstract class CaffeineBeverage {

    // The prepareRecipe method is now declared final. This means that the general
    // algorithm for preparing caffeine beverages is now encapsulated in a method.
    // The steps of the algorithm are not overridden in the subclasses.
    // The subclasses are forced to use the steps defined in the superclass.
    // The prepareRecipe method is now a template method.
    // The template method defines the steps of an algorithm and allows subclasses
    // to provide the implementation for one or more steps.
    // The template method makes the algorithm a part of the superclass.
    // The template method is declared final to keep subclasses from changing the
    // algorithm.
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // These methods are implemented by the subclasses
    abstract void brew();

    abstract void addCondiments();

    // These methods are the same for all subclasses
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
