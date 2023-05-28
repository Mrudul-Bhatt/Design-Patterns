package CompoundPattern.Level6_Observer.Ducks;

import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackable;
import CompoundPattern.Level6_Observer.Subject;

public class RubberDuck implements IQuackable {
    Subject observable;

    public RubberDuck() {
        observable = new Subject(this);
    }

    @Override
    public void registerObserver(IObserver IObserver) {
        observable.registerObserver(IObserver);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

}
