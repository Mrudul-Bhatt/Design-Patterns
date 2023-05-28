package CompoundPattern.Level6_Observer;

import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackable;

public class QuackCounter implements IQuackable {
    static int numberOfQuacks;
    IQuackable duck;

    public QuackCounter(IQuackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(IObserver observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
}
