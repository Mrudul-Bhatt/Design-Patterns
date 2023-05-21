package CommandPattern.Level2.Vendor;

public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + "Garage Door is open");
    }

    public void down() {
        System.out.println(location + "Garage Door is closed");
    }

    public void stop() {
        System.out.println(location + "Garage door is stopped");
    }

    public void lightOn() {
        System.out.println(location + "Garage door light is on");
    }

    public void lightOff() {
        System.out.println(location + "Garage door light is off");
    }
}
