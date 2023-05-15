package DecoratorPattern.Level2;

public class DarkRoastWithMocha extends Beverage {
    public DarkRoastWithMocha() {
        description = "Dark Roast, Mocha";
    }

    @Override
    public double cost() {
        return 2.8;
    }
}
