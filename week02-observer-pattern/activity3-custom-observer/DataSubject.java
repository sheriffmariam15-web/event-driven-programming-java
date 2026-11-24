// ============================================================
// DATA SUBJECT INTERFACE
// ============================================================
// Any subject (publisher) must support adding,
// removing and notifying observers.
//
public interface DataSubject {

    void addObserver(DataObserver o);

    void removeObserver(DataObserver o);

    void notifyObservers();
}
