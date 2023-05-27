package StatePattern.Level2;

public class GumballMachine {
    // final static int SOLD_OUT = 0;
    // final static int NO_QUARTER = 1;
    // final static int HAS_QUARTER = 2;
    // final static int SOLD = 3;

    // int state = SOLD_OUT;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = count;

        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
        // if (state == HAS_QUARTER) {
        // System.out.println("You can't insert another quarter.");
        // } else if (state == NO_QUARTER) {
        // state = HAS_QUARTER;
        // System.out.println("You inserted a quarter.");
        // } else if (state == SOLD_OUT) {
        // System.out.println("You can't insert a quarter, the machine is sold out.");
        // } else if (state == SOLD) {
        // System.out.println("Please wait, we're already giving you a gumball.");
        // }
    }

    public void ejectQuarter() {
        state.ejectQuarter();
        // if (state == HAS_QUARTER) {
        // System.out.println("Quarter returned.");
        // state = NO_QUARTER;
        // } else if (state == NO_QUARTER) {
        // System.out.println("You haven't inserted a quarter.");
        // } else if (state == SOLD_OUT) {
        // System.out.println("You can't eject, you haven't inserted a quarter yet.");
        // } else if (state == SOLD) {
        // System.out.println("Sorry, you already turned the crank.");
        // }
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
        // if (state == HAS_QUARTER) {
        // System.out.println("You turned...");
        // state = SOLD;
        // dispense();
        // } else if (state == NO_QUARTER) {
        // System.out.println("You turned but there's no quarter.");
        // } else if (state == SOLD_OUT) {
        // System.out.println("You turned but there's no gumballs.");
        // } else if (state == SOLD) {
        // System.out.println("Turning twice doesn't get you another gumball.");
        // }
    }

    // public void dispense() {
    // if (state == HAS_QUARTER) {
    // System.out.println("No gumball dispensed.");
    // } else if (state == NO_QUARTER) {
    // System.out.println("You need to pay first.");
    // } else if (state == SOLD_OUT) {
    // System.out.println("No gumball dispensed.");
    // } else if (state == SOLD) {
    // System.out.println("A gumball comes rolling out the slot.");
    // count -= 1;
    // if (count == 0) {
    // System.out.println("Oops, out of gumballs.");
    // state = SOLD_OUT;
    // } else {
    // state = NO_QUARTER;
    // }
    // }
    // }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot.");
        if (count != 0) {
            count -= 1;
        }
    }

}
