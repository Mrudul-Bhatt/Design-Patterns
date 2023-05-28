package CompoundPattern.Level6_Observer.Factories;

import CompoundPattern.Level6_Observer.AbstractDuckFactory;
import CompoundPattern.Level6_Observer.Ducks.DuckCall;
import CompoundPattern.Level6_Observer.Ducks.MallardDuck;
import CompoundPattern.Level6_Observer.Ducks.RedheadDuck;
import CompoundPattern.Level6_Observer.Ducks.RubberDuck;
import CompoundPattern.Level6_Observer.Interface.IQuackable;

public class DuckFactory extends AbstractDuckFactory {
    public IQuackable createMallardDuck() {
        return new MallardDuck();
    }

    public IQuackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public IQuackable createDuckCall() {
        return new DuckCall();
    }

    public IQuackable createRubberDuck() {
        return new RubberDuck();
    }
}
