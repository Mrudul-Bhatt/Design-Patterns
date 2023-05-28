package CompoundPattern.Level4_AbstractFactory;

import CompoundPattern.Level1_Strategy.IQuackable;
import CompoundPattern.Level2_Adapter.Goose;
import CompoundPattern.Level2_Adapter.GooseAdapter;
import CompoundPattern.Level3_Decorator.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        IQuackable mallardDuck = duckFactory.createMallardDuck();
        IQuackable redheadDuck = duckFactory.createRedheadDuck();
        IQuackable duckCall = duckFactory.createDuckCall();
        IQuackable rubberDuck = duckFactory.createRubberDuck();
        IQuackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(IQuackable duck) {
        duck.quack();
    }
}
