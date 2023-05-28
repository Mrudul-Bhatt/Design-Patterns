package CompoundPattern.Level6_Observer;

import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackSubject;

public class Quackologist implements IObserver {

    @Override
    public void update(IQuackSubject duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

}
