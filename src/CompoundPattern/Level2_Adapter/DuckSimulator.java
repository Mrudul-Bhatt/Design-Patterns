package CompoundPattern.Level2_Adapter;

import CompoundPattern.Level1_Strategy.DuckCall;
import CompoundPattern.Level1_Strategy.IQuackable;
import CompoundPattern.Level1_Strategy.MallardDuck;
import CompoundPattern.Level1_Strategy.RedheadDuck;
import CompoundPattern.Level1_Strategy.RubberDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        IQuackable mallardDuck = new MallardDuck();
        IQuackable redheadDuck = new RedheadDuck();
        IQuackable duckCall = new DuckCall();
        IQuackable rubberDuck = new RubberDuck();

        IQuackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    void simulate(IQuackable duck) {
        duck.quack();
    }
}
