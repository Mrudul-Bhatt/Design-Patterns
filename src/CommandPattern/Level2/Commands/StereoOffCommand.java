package CommandPattern.Level2.Commands;

import CommandPattern.Level2.Command;
import CommandPattern.Level2.Vendor.Stereo;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        System.out.println("Undoing last command...");
        stereo.on();
        stereo.setCd();
        stereo.setVolume(12);
    }

}
