package StrategyPattern.Level3;

public class MallardDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("This is a Mallard duck");
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
