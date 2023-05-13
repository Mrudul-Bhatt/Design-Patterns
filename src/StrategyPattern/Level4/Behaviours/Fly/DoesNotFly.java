package StrategyPattern.Level4.Behaviours.Fly;

public class DoesNotFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
