import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// ============================================================
// DEMO 3: PropertyChangeListener (from java.beans)
// ============================================================
// Common in JavaBeans and Swing.
//
// Uses a helper class called
// PropertyChangeSupport to automatically manage
// listeners.
//
// When a property changes, listeners receive
// both the old value and the new value.
//
public class PropertyChangeDemo {

    static class Person {

        // Helper object that manages all listeners.
        private final PropertyChangeSupport support =
                new PropertyChangeSupport(this);

        private String name;

        // Register a listener.
        public void addPropertyChangeListener(
                PropertyChangeListener listener) {

            support.addPropertyChangeListener(listener);
        }

        // Change the name property.
        public void setName(String newName) {

            String oldName = this.name;
            this.name = newName;

            // Fire a PropertyChangeEvent
            // to all registered listeners.
            support.firePropertyChange(
                    "name",
                    oldName,
                    newName
            );
        }
    }

    public static void main(String[] args) {

        Person person = new Person();

        // Listener A
        person.addPropertyChangeListener(evt ->
                System.out.println(
                        "Listener A: "
                                + evt.getPropertyName()
                                + " changed from "
                                + evt.getOldValue()
                                + " to "
                                + evt.getNewValue()
                ));

        // Listener B
        person.addPropertyChangeListener(evt ->
                System.out.println(
                        "Listener B: noticed name is now "
                                + evt.getNewValue()
                ));

        // Trigger the property changes
        person.setName("Alice");
        person.setName("Bob");
    }
}