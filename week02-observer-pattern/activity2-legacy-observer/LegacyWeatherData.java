import java.util.Observable;

// ============================================================
// LEGACY SUBJECT using java.util.Observable (Deprecated!)
// ============================================================
// Notice: we must EXTEND Observable.
// This is a key limitation because Java only
// supports single inheritance.
//
// This class stores weather data and notifies
// observers when the data changes.
//
@SuppressWarnings("deprecation")
public class LegacyWeatherData extends Observable {

    private float temperature;
    private float humidity;

    public void setMeasurements(float temperature, float humidity) {

        this.temperature = temperature;
        this.humidity = humidity;

        // Required before notifying observers.
        // Marks this Observable as "changed".
        setChanged();

        // Notify all observers.
        // No data is passed directly (pull model).
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}