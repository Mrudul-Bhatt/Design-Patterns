package ObserverPattern.Level2;

import ObserverPattern.Level2.Displays.CurrentConditions;
import ObserverPattern.Level2.Displays.Forecast;
import ObserverPattern.Level2.Displays.Statistics;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentDisplay = new CurrentConditions(weatherData);
        Statistics statisticsDisplay = new Statistics(weatherData);
        Forecast forecastDisplay = new Forecast(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
