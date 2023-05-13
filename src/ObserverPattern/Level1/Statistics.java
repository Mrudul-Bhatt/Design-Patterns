package ObserverPattern.Level1;

public class Statistics {
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Statistics: " + temp + "F degrees and " + humidity + "% humidity and " + pressure
                + " pressure");
    }
}
