// ============================================================
// DATA OBSERVER INTERFACE
// ============================================================
// Any class that wants to receive updates from
// the DataModel must implement this interface.
//
public interface DataObserver {

    void onDataChanged(int newValue);
}