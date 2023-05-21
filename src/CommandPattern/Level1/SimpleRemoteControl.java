package CommandPattern.Level1;

public class SimpleRemoteControl {
    Command slot;

    public void buttonWasPressed() {
        slot.execute();
    }

    public void setSlot(Command command) {
        this.slot = command;
    }
}
