// ============================================================
// ITEM LISTENER DEMO
// ============================================================
// Demonstrates:
//
// JCheckBox
// JRadioButton
// ItemListener
//
// The label updates whenever selections change.
// ============================================================

import javax.swing.*;
import java.awt.*;

public class PreferencesDemo {

    private static JLabel statusLabel;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                PreferencesDemo::createAndShow
        );
    }

    private static void createAndShow() {

        JFrame frame =
                new JFrame(
                        "Preferences Demo"
                );

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(500, 300);

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new GridLayout(
                        6,
                        1
                )
        );

        // =====================================================
        // HOBBIES
        // =====================================================

        JCheckBox reading =
                new JCheckBox("Reading");

        JCheckBox coding =
                new JCheckBox("Coding");

        JCheckBox crochet =
                new JCheckBox("Crochet");

        // =====================================================
        // THEME SELECTION
        // =====================================================

        JRadioButton pinkTheme =
                new JRadioButton("Pink Theme");

        JRadioButton pearlTheme =
                new JRadioButton("Pearl Theme");

        ButtonGroup group =
                new ButtonGroup();

        group.add(pinkTheme);
        group.add(pearlTheme);

        // =====================================================
        // STATUS LABEL
        // =====================================================

        statusLabel =
                new JLabel(
                        "Select options...",
                        SwingConstants.CENTER
                );

        // =====================================================
        // SHARED LISTENER
        // =====================================================

        var listener =
                (java.awt.event.ItemListener) e ->
                        updateStatus(
                                reading,
                                coding,
                                crochet,
                                pinkTheme,
                                pearlTheme
                        );

        reading.addItemListener(listener);
        coding.addItemListener(listener);
        crochet.addItemListener(listener);

        pinkTheme.addItemListener(listener);
        pearlTheme.addItemListener(listener);

        frame.add(reading);
        frame.add(coding);
        frame.add(crochet);

        frame.add(pinkTheme);
        frame.add(pearlTheme);

        frame.add(statusLabel);

        frame.setVisible(true);
    }

    private static void updateStatus(

            JCheckBox reading,
            JCheckBox coding,
            JCheckBox crochet,

            JRadioButton pink,
            JRadioButton pearl
    ) {

        String theme = "None";

        if (pink.isSelected()) {
            theme = "Pink";
        }

        if (pearl.isSelected()) {
            theme = "Pearl";
        }

        statusLabel.setText(
                "Theme: " + theme
        );
    }
}
