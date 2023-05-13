package StrategyPattern.Level2;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {

    }
}
