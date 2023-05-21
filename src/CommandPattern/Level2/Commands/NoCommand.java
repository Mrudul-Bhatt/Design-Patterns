package CommandPattern.Level2.Commands;

import CommandPattern.Level2.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command assigned");
    }

    @Override
    public void undo() {
        System.out.println("No command assigned");
    }

}
