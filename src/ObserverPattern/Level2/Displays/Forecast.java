package ObserverPattern.Level2.Displays;

import ObserverPattern.Level2.Interfaces.IDisplay;
import ObserverPattern.Level2.Interfaces.IObserver;
import ObserverPattern.Level2.Interfaces.ISubject;

public class Forecast implements IObserver, IDisplay {
    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public Forecast(ISubject weatherData) {
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
        System.out.println("Forecast : " + temperature + "F degrees and " + humidity + "% humidity and "
                + pressure + " pressure");
    }
}
