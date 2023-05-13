package StrategyPattern.Level4;

import StrategyPattern.Level4.Behaviours.Fly.FlyBehaviour;
import StrategyPattern.Level4.Behaviours.Quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour _flyBehaviour;
    QuackBehaviour _quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this._flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this._quackBehaviour = quackBehaviour;
    }

    public void performQuack() {
        _quackBehaviour.quack();
    }

    public void performFly() {
        _flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("Swim!");
    }

    public abstract void display();

}
