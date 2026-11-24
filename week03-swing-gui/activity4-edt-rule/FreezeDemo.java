// ============================================================
// FREEZE DEMO
// ============================================================
// BAD PRACTICE:
//
// This example blocks the EDT using
// Thread.sleep(5000).
//
// The GUI will freeze for 5 seconds.
//
// Purpose:
// Demonstrate WHY Swing applications
// must avoid long-running operations on
// the Event Dispatch Thread (EDT).
// ============================================================

import javax.swing.*;
import java.awt.*;

public class FreezeDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame =
                    new JFrame(
                            "EDT Demo - BAD Practice"
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
                    new JButton("Freeze the UI");

            // =================================================
            // BAD EXAMPLE
            // =================================================

            button.addActionListener(e -> {

                status.setText("Working...");

                try {

                    // Simulates a long task
                    Thread.sleep(5000);

                } catch (InterruptedException ex) {

                    ex.printStackTrace();
                }

                status.setText("Done!");
            });

            frame.add(button);
            frame.add(status);

            frame.setVisible(true);

            System.out.println(
                    "Running on: "
                    + Thread.currentThread().getName()
            );
        });
    }
}
