// ============================================================
// LABEL DISPLAY
// ============================================================
// Displays the value as plain text.
//
public class LabelDisplay implements DataObserver {

    @Override
    public void onDataChanged(int newValue) {

        System.out.println(
                "Label shows: " + newValue);
    }
}
