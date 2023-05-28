package CompoundPattern.Level3_Decorator;

import CompoundPattern.Level1_Strategy.DuckCall;
import CompoundPattern.Level1_Strategy.IQuackable;
import CompoundPattern.Level1_Strategy.MallardDuck;
import CompoundPattern.Level1_Strategy.RedheadDuck;
import CompoundPattern.Level1_Strategy.RubberDuck;
import CompoundPattern.Level2_Adapter.Goose;
import CompoundPattern.Level2_Adapter.GooseAdapter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        IQuackable mallardDuck = new QuackCounter(new MallardDuck());
        IQuackable redheadDuck = new QuackCounter(new RedheadDuck());
        IQuackable duckCall = new QuackCounter(new DuckCall());
        IQuackable rubberDuck = new QuackCounter(new RubberDuck());

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
