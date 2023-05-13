import StrategyPattern.Level1.Duck;
import StrategyPattern.Level1.MallardDuck;
import StrategyPattern.Level1.RedheadDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Duck duck1 = new MallardDuck();
        duck1.quack();
        duck1.swim();
        duck1.display();
        Duck duck2 = new RedheadDuck();
        duck2.quack();
        duck2.swim();
        duck2.display();
    }
}