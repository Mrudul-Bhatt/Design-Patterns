package CommandPattern.Level2.Commands;

import CommandPattern.Level2.Command;
import CommandPattern.Level2.Vendor.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(12);
    }

    @Override
    public void undo() {
        System.out.println("Undoing last command...");
        stereo.off();
    }
}
