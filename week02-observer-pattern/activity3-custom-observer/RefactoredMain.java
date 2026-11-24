// ============================================================
// REFACTORED MAIN PROGRAM
// ============================================================
// Demonstrates the Observer Pattern.
//
// Notice:
// DataModel does not know anything about
// LabelDisplay, BarChartDisplay, or TextLogger.
//
public class RefactoredMain {

    public static void main(String[] args) {

        DataModel model = new DataModel();

        // Register observers
        model.addObserver(new LabelDisplay());
        model.addObserver(new BarChartDisplay());
        model.addObserver(new TextLogger());

        // Change data
        model.setValue(10);

        System.out.println();

        model.setValue(20);

        System.out.println();

        model.setValue(30);
    }
}