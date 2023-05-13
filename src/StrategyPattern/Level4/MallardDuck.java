package StrategyPattern.Level4;

import StrategyPattern.Level4.Behaviours.Fly.FlyWithWings;
import StrategyPattern.Level4.Behaviours.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        _quackBehaviour = new Quack();
        _flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is a Mallard duck");
    }
}
