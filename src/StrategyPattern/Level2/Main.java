package StrategyPattern.Level2;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new RubberDuck();
        duck1.fly();
        duck1.display();
        duck1.quack();
        duck1.swim();

        Duck duck2 = new DecoyDuck();
        duck2.fly();
        duck2.display();
        duck2.quack();
        duck2.swim();
    }
}
