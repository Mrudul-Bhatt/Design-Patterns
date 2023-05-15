package DecoratorPattern.Level3;

public class EspressoWithSteamedMilk extends Beverage {
    public EspressoWithSteamedMilk() {
        description = "Espresso, Steamed Milk";
        setMilk(true);
    }

    @Override
    public double cost() {
        return 2.09 + super.cost();
    }
}
