package StrategyPattern.Level3;

public class RedheadDuck extends Duck implements Quackable,Flyable{
    @Override
    public void display() {
        System.out.println("This is a Redhead duck");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
