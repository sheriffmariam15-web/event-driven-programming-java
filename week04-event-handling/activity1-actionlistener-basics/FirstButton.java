// ============================================================
// FIRST INTERACTIVE BUTTON
// ============================================================
// This is the simplest interactive Swing application.
// When the user clicks the button, a message appears.
// ============================================================

import javax.swing.*;
import java.awt.*;

public class FirstButton {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                FirstButton::createAndShow
        );
    }

    private static void createAndShow() {

        JFrame frame =
                new JFrame(
                        "First Interactive Button"
                );

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(400, 200);

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new FlowLayout(
                        FlowLayout.CENTER,
                        20,
                        50
                )
        );

        // =====================================================
        // EVENT SOURCE
        // =====================================================

        JButton clickButton =
                new JButton("Click Me!");

        // =====================================================
        // EVENT LISTENER
        // =====================================================

        clickButton.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    frame,
                    "Welcome to JJK!",
                    "Domain Expansion, Malovelent Shrine",
                    JOptionPane.INFORMATION_MESSAGE
            );

        });

        frame.add(clickButton);

        frame.setVisible(true);
    }
}
