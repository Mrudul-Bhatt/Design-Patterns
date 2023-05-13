package ObserverPattern.Level2;

import java.util.ArrayList;

import ObserverPattern.Level2.Interfaces.IObserver;
import ObserverPattern.Level2.Interfaces.ISubject;

public class WeatherData implements ISubject {

    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        // TODO Auto-generated constructor stub
        observers = new ArrayList<IObserver>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(IObserver o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        // TODO Auto-generated method stub

        int i = observers.indexOf(o);

        if (i >= 0)
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub

        observers.forEach((observer) -> {
            observer.update(temperature, humidity, pressure);
        });
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
