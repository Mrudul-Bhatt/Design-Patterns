package StrategyPattern.Level4;

import StrategyPattern.Level4.Behaviours.Fly.FlyWithRocket;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.performQuack();
        duck1.performFly();
        duck1.swim();

        Duck duck2 = new ModelDuck();
        duck2.display();
        duck2.performFly();
        duck2.setFlyBehaviour(new FlyWithRocket());
        duck2.performFly();
    }
}
