// ============================================================
// LEGACY OBSERVER DEMO
// ============================================================
// Demonstrates how the old java.util.Observer
// and Observable classes work together.
//
// These classes were deprecated in Java 9.
// Modern applications should use custom
// Observer implementations instead.
//
public class LegacyMain {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

        // Create the Observable subject.
        LegacyWeatherData data =
                new LegacyWeatherData();

        // Create the Observer.
        LegacyDisplay display =
                new LegacyDisplay();

        // Register observer.
        data.addObserver(display);

        // Simulate weather updates.
        data.setMeasurements(26.0f, 60.0f);

        data.setMeasurements(30.0f, 75.0f);
    }
}