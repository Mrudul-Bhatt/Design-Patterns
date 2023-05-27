package StatePattern.Level2.States;

import StatePattern.Level2.GumballMachine;
import StatePattern.Level2.IState;

public class WinnerState implements IState {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException("Unimplemented method 'insertQuarter'");
    }

    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException("Unimplemented method 'ejectQuarter'");
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException("Unimplemented method 'turnCrank'");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter.");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

}
