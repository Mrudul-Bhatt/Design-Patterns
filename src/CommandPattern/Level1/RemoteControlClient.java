package CommandPattern.Level1;

import CommandPattern.Level1.VendorClasses.GarageDoor;
import CommandPattern.Level1.VendorClasses.Light;

public class RemoteControlClient {
    // public static void main(String[] args) {
    // SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    // Light light = new Light();
    // LightOnCommand lightOnCommand = new LightOnCommand(light);

    // simpleRemoteControl.setSlot(lightOnCommand);
    // simpleRemoteControl.buttonWasPressed();

    // GarageDoor garageDoor = new GarageDoor();
    // GarageDoorOpenCommand garageDoorOpenCommand = new
    // GarageDoorOpenCommand(garageDoor);

    // simpleRemoteControl.setSlot(garageDoorOpenCommand);
    // simpleRemoteControl.buttonWasPressed();
    // }

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        remote.setSlot(light::on);
        remote.buttonWasPressed();
        remote.setSlot(garageDoor::up);
        remote.buttonWasPressed();
        remote.setSlot(garageDoor::lightOn);
        remote.buttonWasPressed();
        remote.setSlot(garageDoor::lightOff);
        remote.buttonWasPressed();
    }
}
