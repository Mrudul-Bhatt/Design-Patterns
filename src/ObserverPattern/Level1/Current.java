package ObserverPattern.Level1;

public class Current {
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity and " + pressure
                + " pressure");
    }
}
