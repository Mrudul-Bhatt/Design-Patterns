package CompoundPattern.Level6_Observer.Ducks;

import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackable;
import CompoundPattern.Level6_Observer.Subject;

public class DuckCall implements IQuackable {
    Subject observable;

    public DuckCall() {
        observable = new Subject(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserver IObserver) {
        observable.registerObserver(IObserver);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
