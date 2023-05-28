package CompoundPattern.Level4_AbstractFactory;

import CompoundPattern.Level1_Strategy.DuckCall;
import CompoundPattern.Level1_Strategy.IQuackable;
import CompoundPattern.Level1_Strategy.MallardDuck;
import CompoundPattern.Level1_Strategy.RedheadDuck;
import CompoundPattern.Level1_Strategy.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public IQuackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public IQuackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public IQuackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public IQuackable createRubberDuck() {
        return new RubberDuck();
    }

}
