import java.util.Observable;
import java.util.Observer;

// ============================================================
// LEGACY OBSERVER using java.util.Observer (Deprecated!)
// ============================================================
// The update() method receives:
// 1. The Observable object
// 2. An optional Object argument
//
// The observer must pull data from the subject
// using getter methods.
//
@SuppressWarnings("deprecation")
public class LegacyDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        // Check if the Observable is the expected type.
        if (o instanceof LegacyWeatherData) {

            LegacyWeatherData data =
                    (LegacyWeatherData) o;

            System.out.println(
                    "Legacy Display -> Temp: "
                            + data.getTemperature()
                            + "°C, Humidity: "
                            + data.getHumidity()
                            + "%"
            );
        }
    }
}
