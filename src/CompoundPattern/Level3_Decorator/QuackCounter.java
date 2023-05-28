package CompoundPattern.Level3_Decorator;

import CompoundPattern.Level1_Strategy.IQuackable;

public class QuackCounter implements IQuackable {
    IQuackable duck;
    // all objects of QuackCounter share the same variable
    static int numberOfQuacks;

    public QuackCounter(IQuackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

}
