package CommandPattern.Level2.Commands;

import CommandPattern.Level2.Vendor.Light;
import CommandPattern.Level2.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        System.out.println("Undoing last command...");
        light.off();
    }
}
