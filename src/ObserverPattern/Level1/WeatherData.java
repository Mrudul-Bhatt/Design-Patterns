package ObserverPattern.Level1;

public class WeatherData {
    float temperature;
    float humidity;
    float pressure;

    public WeatherData() {
        temperature = 80;
        humidity = 65;
        pressure = 30.4f;
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

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        Current current = new Current();
        current.update(temp, humidity, pressure);
        Statistics statistics = new Statistics();
        statistics.update(temp, humidity, pressure);
        Forecast forecast = new Forecast();
        forecast.update(temp, humidity, pressure);
    }
}
