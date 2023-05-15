package DecoratorPattern.Level4;

public class StarbuzzCofee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        var beverageWithMocha = new Mocha(beverage);

        System.out.println(beverageWithMocha.getDescription() + " $" + beverageWithMocha.cost());

        var beverageWithDoubleMocha = new Mocha(beverageWithMocha);

        System.out.println(beverageWithDoubleMocha.getDescription() + " $" + beverageWithDoubleMocha.cost());

        var beverageWithDoubleMochaAndWhip = new Whip(beverageWithDoubleMocha);

        System.out.println(beverageWithDoubleMochaAndWhip.getDescription() + " $" + beverageWithDoubleMochaAndWhip.cost());

    }
}
