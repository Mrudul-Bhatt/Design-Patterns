package CommandPattern.Level2;

import CommandPattern.Level2.Commands.CeilingFanHighCommand;
import CommandPattern.Level2.Commands.CeilingFanLowCommand;
import CommandPattern.Level2.Commands.CeilingFanMediumCommand;
import CommandPattern.Level2.Commands.CeilingFanOffCommand;
import CommandPattern.Level2.Commands.LightOffCommand;
import CommandPattern.Level2.Commands.LightOnCommand;
import CommandPattern.Level2.Commands.MacroCommand;
import CommandPattern.Level2.Commands.StereoOffCommand;
import CommandPattern.Level2.Commands.StereoOnWithCDCommand;
import CommandPattern.Level2.Vendor.CeilingFan;
import CommandPattern.Level2.Vendor.Light;
import CommandPattern.Level2.Vendor.Stereo;

public class RemoteLoaderClient {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitcheLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitcheLightOff = new LightOffCommand(kitchenLight);

        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitcheLightOn, kitcheLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(5, ceilingFanLow, ceilingFanOff);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();

        // Macro Command

        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, ceilingFanHigh };
        Command[] partyOff = { livingRoomLightOff, stereoOff, ceilingFanOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(6);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(6);
        System.out.println("--- Pushing Macro Undo ---");
        remoteControl.undoButtonWasPushed();

    }
}
