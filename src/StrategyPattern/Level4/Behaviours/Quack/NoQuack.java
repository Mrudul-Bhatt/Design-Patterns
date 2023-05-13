package StrategyPattern.Level4.Behaviours.Quack;

public class NoQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I cant Quack");
    }
}
