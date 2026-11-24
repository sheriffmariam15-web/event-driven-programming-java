// ============================================================
// FIXED DEMO
// ============================================================
// GOOD PRACTICE:
//
// Long-running tasks should NOT run on the EDT.
//
// Instead:
// 1. Run the task on a background thread.
// 2. Update the GUI on the EDT.
//
// This keeps the application responsive.
// ============================================================

import javax.swing.*;
import java.awt.*;

public class FixedDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame =
                    new JFrame(
                            "EDT Demo - GOOD Practice"
                    );

            frame.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE
            );

            frame.setSize(400, 200);

            frame.setLocationRelativeTo(null);

            frame.setLayout(
                    new FlowLayout()
            );

            JLabel status =
                    new JLabel("Ready");

            JButton button =
                    new JButton(
                            "Do Long Operation"
                    );

            // =================================================
            // GOOD EXAMPLE
            // =================================================

            button.addActionListener(e -> {

                status.setText("Working...");

                button.setEnabled(false);

                // Start background thread
                new Thread(() -> {

                    try {

                        // Simulate long task
                        Thread.sleep(5000);

                    } catch (InterruptedException ex) {

                        ex.printStackTrace();
                    }

                    // Return safely to EDT
                    SwingUtilities.invokeLater(() -> {

                        status.setText("Done!");

                        button.setEnabled(true);
                    });

                }).start();

            });

            frame.add(button);
            frame.add(status);

            frame.setVisible(true);

            System.out.println(
                    "Running on thread: "
                    + Thread.currentThread().getName()
            );
        });
    }
}