package CompoundPattern.Level6_Observer.Ducks;

import CompoundPattern.Level2_Adapter.Goose;
import CompoundPattern.Level6_Observer.Interface.IObserver;
import CompoundPattern.Level6_Observer.Interface.IQuackable;
import CompoundPattern.Level6_Observer.Subject;

public class GooseAdapter implements IQuackable {
    Goose goose;
    Subject subject;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        subject = new Subject(this);
    }

    @Override
    public void registerObserver(IObserver observer) {
        subject.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        subject.notifyObservers();
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }
}
