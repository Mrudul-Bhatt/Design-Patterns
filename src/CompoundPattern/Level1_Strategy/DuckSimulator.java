package CompoundPattern.Level1_Strategy;

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

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    void simulate(IQuackable duck) {
        duck.quack();
    }

}
