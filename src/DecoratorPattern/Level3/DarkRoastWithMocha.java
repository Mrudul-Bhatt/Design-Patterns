package DecoratorPattern.Level3;

public class DarkRoastWithMocha extends Beverage {
    public DarkRoastWithMocha() {
        description = "Dark Roast, Mocha";
        setMocha(true);
    }

    @Override
    public double cost() {
        return 2.8 + super.cost();
    }
}
