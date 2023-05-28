package CompoundPattern.Level6_Observer;

import CompoundPattern.Level2_Adapter.Goose;
import CompoundPattern.Level6_Observer.Ducks.GooseAdapter;
import CompoundPattern.Level6_Observer.Factories.CountingDuckFactory;
import CompoundPattern.Level6_Observer.Interface.IQuackable;

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

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(IQuackable duck) {
        duck.quack();
    }

}
