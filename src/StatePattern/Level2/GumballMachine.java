package StatePattern.Level2;

import StatePattern.Level2.States.HasQuarterState;
import StatePattern.Level2.States.NoQuarterState;
import StatePattern.Level2.States.SoldOutState;
import StatePattern.Level2.States.SoldState;
import StatePattern.Level2.States.WinnerState;

public class GumballMachine {

    IState soldOutState;
    IState noQuarterState;
    IState hasQuarterState;
    IState soldState;
    IState winnerState;

    IState state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = count;

        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state = noQuarterState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public IState getHasQuarterState() {
        return hasQuarterState;
    }

    public IState getNoQuarterState() {
        return noQuarterState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public IState getWinnerState() {
        return winnerState;
    }

    public IState getState() {
        return state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot.");
        if (count != 0) {
            count -= 1;
        }
    }

}
