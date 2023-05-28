package CompoundPattern.Level4_AbstractFactory;

import CompoundPattern.Level1_Strategy.DuckCall;
import CompoundPattern.Level1_Strategy.IQuackable;
import CompoundPattern.Level1_Strategy.MallardDuck;
import CompoundPattern.Level1_Strategy.RedheadDuck;
import CompoundPattern.Level1_Strategy.RubberDuck;
import CompoundPattern.Level3_Decorator.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public IQuackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public IQuackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public IQuackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public IQuackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
