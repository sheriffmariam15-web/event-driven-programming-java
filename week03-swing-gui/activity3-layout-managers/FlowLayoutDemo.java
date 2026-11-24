// ============================================================
// FLOWLAYOUT DEMO
// ============================================================
// FlowLayout places components left-to-right.
//
// When there is no more space,
// components automatically wrap to the next line.
//
// Similar to how words wrap in a paragraph.
// ============================================================

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame =
                    new JFrame("FlowLayout Demo");

            frame.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE);

            frame.setSize(500, 300);

            frame.setLocationRelativeTo(null);

            // FlowLayout:
            // LEFT alignment
            // 10px horizontal gap
            // 10px vertical gap

            frame.setLayout(
                    new FlowLayout(
                            FlowLayout.RIGHT,
                            10,
                            10
                    )
            );

            // Create 12 buttons
            for (int i = 1; i <= 12; i++) {

                frame.add(
                        new JButton(
                                "Button " + i
                        )
                );
            }

            frame.setVisible(true);
        });
    }
}

