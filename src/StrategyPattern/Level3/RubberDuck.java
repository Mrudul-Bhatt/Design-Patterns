package StrategyPattern.Level3;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
