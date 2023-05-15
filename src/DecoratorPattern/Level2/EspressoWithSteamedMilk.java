package DecoratorPattern.Level2;

public class EspressoWithSteamedMilk extends Beverage {
    public EspressoWithSteamedMilk() {
        description = "Espresso, Steamed Milk";
    }

    @Override
    public double cost() {
        return 2.09;
    }
}
