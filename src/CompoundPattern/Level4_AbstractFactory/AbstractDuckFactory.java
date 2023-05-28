package CompoundPattern.Level4_AbstractFactory;

import CompoundPattern.Level1_Strategy.IQuackable;

public abstract class AbstractDuckFactory {
    public abstract IQuackable createMallardDuck();

    public abstract IQuackable createRedheadDuck();

    public abstract IQuackable createDuckCall();

    public abstract IQuackable createRubberDuck();
}
