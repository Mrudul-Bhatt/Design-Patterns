package StrategyPattern.Level4;

import StrategyPattern.Level4.Behaviours.Quack.QuackBehaviour;

public class RubberDuck extends Duck implements QuackBehaviour {
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
