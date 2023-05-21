package CommandPattern.Level2.Commands;

import CommandPattern.Level2.Command;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("Executing macro command...");
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("Undoing macro command...");
        for (Command command : commands) {
            command.undo();
        }
    }

}
