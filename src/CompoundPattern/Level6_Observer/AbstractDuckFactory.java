package CompoundPattern.Level6_Observer;

import CompoundPattern.Level6_Observer.Interface.IQuackable;

public abstract class AbstractDuckFactory {
    public abstract IQuackable createMallardDuck();

    public abstract IQuackable createRedheadDuck();

    public abstract IQuackable createDuckCall();

    public abstract IQuackable createRubberDuck();
}
