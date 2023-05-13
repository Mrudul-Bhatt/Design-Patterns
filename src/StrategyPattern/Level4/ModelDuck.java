package StrategyPattern.Level4;

import StrategyPattern.Level4.Behaviours.Fly.DoesNotFly;
import StrategyPattern.Level4.Behaviours.Quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        _flyBehaviour = new DoesNotFly();
        _quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
