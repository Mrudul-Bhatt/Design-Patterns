package CommandPattern.Level2.Commands;

import CommandPattern.Level2.Vendor.Light;
import CommandPattern.Level2.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.println("Undoing last command...");
        light.on();
    }
}
