package CommandPattern.Level1.VendorClasses;

public class GarageDoor {
    public void up() {
        System.out.println("Garage Door is open");
    }

    public void down() {
        System.out.println("Garage Door is closed");
    }

    public void stop() {
        System.out.println("Garage door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage door light is on");
    }

    public void lightOff() {
        System.out.println("Garage door light is off");
    }
}
