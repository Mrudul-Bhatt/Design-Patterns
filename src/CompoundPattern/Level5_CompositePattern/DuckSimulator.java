package CompoundPattern.Level5_CompositePattern;

import CompoundPattern.Level1_Strategy.IQuackable;
import CompoundPattern.Level2_Adapter.Goose;
import CompoundPattern.Level2_Adapter.GooseAdapter;
import CompoundPattern.Level3_Decorator.QuackCounter;
import CompoundPattern.Level4_AbstractFactory.AbstractDuckFactory;
import CompoundPattern.Level4_AbstractFactory.CountingDuckFactory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);

    }

    void simulate(AbstractDuckFactory duckFactory) {
        IQuackable redheadDuck = duckFactory.createRedheadDuck();
        IQuackable duckCall = duckFactory.createDuckCall();
        IQuackable rubberDuck = duckFactory.createRubberDuck();
        IQuackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        IQuackable mallardOne = duckFactory.createMallardDuck();
        IQuackable mallardTwo = duckFactory.createMallardDuck();
        IQuackable mallardThree = duckFactory.createMallardDuck();
        IQuackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(IQuackable duck) {
        duck.quack();
    }
}
