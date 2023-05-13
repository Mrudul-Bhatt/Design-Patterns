package ObserverPattern.Level2.Displays;

import ObserverPattern.Level2.Interfaces.IDisplay;
import ObserverPattern.Level2.Interfaces.IObserver;
import ObserverPattern.Level2.Interfaces.ISubject;

public class CurrentConditions implements IObserver, IDisplay {
    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public CurrentConditions(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and "
                + pressure + " pressure");
    }
}
