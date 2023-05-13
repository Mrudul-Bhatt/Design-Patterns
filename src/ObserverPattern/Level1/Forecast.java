package ObserverPattern.Level1;

public class Forecast {
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Forecast: " + temp + "F degrees and " + humidity + "% humidity and " + pressure
                + " pressure");
    }
}
