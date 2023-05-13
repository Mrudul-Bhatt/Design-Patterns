package StrategyPattern.Level4;

import StrategyPattern.Level4.Behaviours.Fly.FlyBehaviour;
import StrategyPattern.Level4.Behaviours.Quack.QuackBehaviour;

public class RedheadDuck extends Duck implements QuackBehaviour, FlyBehaviour {
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
