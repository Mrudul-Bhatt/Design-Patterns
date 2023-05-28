package CompoundPattern.Level6_Observer;

import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements IQuackable {
    List<IQuackable> ducks = new ArrayList<>();

    public void add(IQuackable duck) {
        ducks.add(duck);
    }

    public void quack() {
        Iterator<IQuackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            IQuackable duck = iterator.next();
            duck.quack();
        }
    }

    public void registerObserver(IObserver observer) {
        Iterator<IQuackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            IQuackable duck = iterator.next();
            duck.registerObserver(observer);
        }
    }

    public void notifyObservers() {
    }

    public String toString() {
        return "Flock of Ducks";
    }
}
