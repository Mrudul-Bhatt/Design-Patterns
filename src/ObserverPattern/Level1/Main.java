package ObserverPattern.Level1;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();
    }
}
