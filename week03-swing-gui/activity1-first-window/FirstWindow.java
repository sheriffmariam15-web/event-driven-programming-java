// ============================================================
// FIRST SWING WINDOW
// ============================================================
// This is the simplest possible Swing application.
// It creates a JFrame (main window) and displays it.
// ============================================================

import javax.swing.*; // Swing components

public class FirstWindow {

    public static void main(String[] args) {

        // CRITICAL:
        // All Swing code must run on the EDT
        // (Event Dispatch Thread).

        SwingUtilities.invokeLater(() -> {
            createAndShowWindow();
        });
    }

    private static void createAndShowWindow() {

        // 1. Create the JFrame (main window)
        JFrame frame = new JFrame("Mariam's First Swing Window");

        // 2. Close the application when X is clicked
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        // 3. Set width and height
        frame.setSize(800, 600);

        // 4. Center the window on screen
        frame.setLocation(100, 100);

        // 5. Display the window
        frame.setVisible(true);

        // 6. Making it non-resizable 
        frame.setResizable(false);

        // Verify we're running on the EDT
        System.out.println(
                "Window created on thread: "
                        + Thread.currentThread().getName());
    }
}