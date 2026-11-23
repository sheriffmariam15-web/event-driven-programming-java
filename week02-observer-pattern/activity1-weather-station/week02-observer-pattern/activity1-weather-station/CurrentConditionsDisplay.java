// ============================================================
// CURRENT CONDITIONS DISPLAY
// ============================================================
// Displays the latest temperature and humidity values.
// This observer reacts whenever WeatherData changes.
//
public class CurrentConditionsDisplay implements Observer {

    @Override
    public void update(float temperature, float humidity, float pressure) {

        System.out.println("  [Current] Temp: "
                + temperature + "°C, "
                + "Humidity: " + humidity + "%");
    }
}