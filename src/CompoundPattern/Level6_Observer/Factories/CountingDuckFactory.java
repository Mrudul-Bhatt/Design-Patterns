package CompoundPattern.Level6_Observer.Factories;

import CompoundPattern.Level6_Observer.AbstractDuckFactory;
import CompoundPattern.Level6_Observer.Ducks.DuckCall;
import CompoundPattern.Level6_Observer.Ducks.MallardDuck;
import CompoundPattern.Level6_Observer.Ducks.RedheadDuck;
import CompoundPattern.Level6_Observer.Ducks.RubberDuck;
import CompoundPattern.Level6_Observer.Interface.IQuackable;
import CompoundPattern.Level6_Observer.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {
    public IQuackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public IQuackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public IQuackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public IQuackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
