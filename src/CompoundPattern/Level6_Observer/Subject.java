package CompoundPattern.Level6_Observer;

import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackSubject;

import java.util.ArrayList;
import java.util.Iterator;

public class Subject implements IQuackSubject {
    ArrayList<IObserver> IObservers = new ArrayList<>();
    IQuackSubject duck;

    public Subject(IQuackSubject duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(IObserver IObserver) {
        IObservers.add(IObserver);
    }

    @Override
    public void notifyObservers() {
        Iterator<IObserver> iterator = IObservers.iterator();

        while (iterator.hasNext()) {
            IObserver IObserver = iterator.next();
            IObserver.update(duck);
        }
    }

}
