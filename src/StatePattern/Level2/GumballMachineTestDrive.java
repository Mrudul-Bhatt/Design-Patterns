package StatePattern.Level2;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(50);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        for (int i = 0; i < 20; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

        System.out.println(gumballMachine);

    }
}
