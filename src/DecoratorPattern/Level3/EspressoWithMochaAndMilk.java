package DecoratorPattern.Level3;

public class EspressoWithMochaAndMilk extends Beverage {
    public EspressoWithMochaAndMilk() {
        description = "Espresso, Mocha, Milk";
        setMilk(true);
        setMocha(true);
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }
}
