// ============================================================
// COUNTER APPLICATION
// ============================================================
// Demonstrates:
//
// JButton
// JLabel
// ActionListener
// Multiple event handlers
//
// The user can:
// + Increment
// + Decrement
// + Reset
// ============================================================

import javax.swing.*;
import java.awt.*;

public class CounterApp {

    // Shared counter value
    private static int count = 0;

    // Label that displays the count
    private static JLabel countLabel;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                CounterApp::createAndShow
        );
    }

    private static void createAndShow() {

        JFrame frame =
                new JFrame("Counter Application");

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(500, 300);

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new BorderLayout(10, 10)
        );

        // =====================================================
        // TITLE
        // =====================================================

        JLabel title =
                new JLabel(
                        "Counter Application",
                        SwingConstants.CENTER
                );

        title.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        24
                )
        );

        frame.add(
                title,
                BorderLayout.NORTH
        );

        // =====================================================
        // COUNT DISPLAY
        // =====================================================

        countLabel =
                new JLabel(
                        "0",
                        SwingConstants.CENTER
                );

        countLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        50
                )
        );

        frame.add(
                countLabel,
                BorderLayout.CENTER
        );

        // =====================================================
        // BUTTON PANEL
        // =====================================================

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout()
                );

        JButton decreaseBtn =
                new JButton("-");

        JButton resetBtn =
                new JButton("Reset");

        JButton increaseBtn =
                new JButton("+");

        // =====================================================
        // EVENT HANDLERS
        // =====================================================

        decreaseBtn.addActionListener(e -> {

            count--;

            updateCounter();
        });

        resetBtn.addActionListener(e -> {

            count = 0;

            updateCounter();
        });

        increaseBtn.addActionListener(e -> {

            count++;

            updateCounter();
        });

        buttonPanel.add(decreaseBtn);
        buttonPanel.add(resetBtn);
        buttonPanel.add(increaseBtn);

        frame.add(
                buttonPanel,
                BorderLayout.SOUTH
        );

        frame.setVisible(true);
    }

    // =====================================================
    // UPDATE DISPLAY
    // =====================================================

    private static void updateCounter() {

        countLabel.setText(
                String.valueOf(count)
        );
    }
}