public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 1013);

        System.out.println();

        weatherData.setMeasurements(28, 70, 1011);

        System.out.println();

        weatherData.setMeasurements(32, 60, 1015);
    }
}
