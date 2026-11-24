// ============================================================
// COMPONENT SHOWCASE
// ============================================================
// Demonstrates the most common Swing components:
//
// JLabel
// JTextField
// JPasswordField
// JCheckBox
// JRadioButton
// JComboBox
// JTextArea
// JButton
// ============================================================

import javax.swing.*;
import java.awt.*;

public class ComponentShowcase {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            createAndShow();
        });
    }

    private static void createAndShow() {

        // =====================================================
        // MAIN WINDOW
        // =====================================================
        JFrame frame = new JFrame("Mariam's Swing Component Showcase");

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 500);

        frame.setLocationRelativeTo(null);

        // Use a vertical grid
        frame.setLayout(
                new GridLayout(8, 1, 10, 10)
        );

        // =====================================================
        // 1. TITLE LABEL
        // =====================================================

        JLabel titleLabel =
                new JLabel(
                        "Mariam's Swing Component Showcase",
                        SwingConstants.CENTER
                );

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        titleLabel.setForeground(Color.MAGENTA);

        frame.add(titleLabel);

        // =====================================================
        // 2. USERNAME FIELD
        // =====================================================

        JPanel row1 =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        row1.add(new JLabel("Username:"));

        row1.add(new JTextField(20));

        frame.add(row1);

        // =====================================================
        // 3. PASSWORD FIELD
        // =====================================================

        JPanel row2 =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        row2.add(new JLabel("Password:"));

        row2.add(new JPasswordField(20));

        frame.add(row2);

        // =====================================================
        // 4. CHECKBOXES
        // =====================================================

        JPanel row3 =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        row3.add(
                new JCheckBox("Remember me")
        );

        row3.add(
                new JCheckBox(
                        "Subscribe to newsletter"
                )
        );

        frame.add(row3);

        // =====================================================
        // 5. RADIO BUTTONS
        // =====================================================

        JPanel row4 =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        row4.add(new JLabel("Gender:"));

        JRadioButton male =
                new JRadioButton("Male");

        JRadioButton female =
                new JRadioButton("Female");

        JRadioButton other =
                new JRadioButton("Other");

        ButtonGroup genderGroup =
                new ButtonGroup();

        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        row4.add(male);
        row4.add(female);
        row4.add(other);

        frame.add(row4);

        // =====================================================
        // 6. COMBO BOX
        // =====================================================

        JPanel row5 =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        row5.add(new JLabel("Country:"));

        String[] countries = {
                "Kenya",
                "Tanzania",
                "Uganda",
                "Rwanda",
                "Ethiopia"
        };

        row5.add(
                new JComboBox<>(countries)
        );

        frame.add(row5);

        // =====================================================
        // 7. TEXT AREA
        // =====================================================

        JPanel row6 =
                new JPanel(
                        new BorderLayout()
                );

        row6.add(
                new JLabel("Comments:"),
                BorderLayout.NORTH
        );

        row6.add(
                new JScrollPane(
                        new JTextArea(3, 40)
                ),
                BorderLayout.CENTER
        );

        frame.add(row6);

        // =====================================================
        // 8. BUTTONS
        // =====================================================

        JPanel row7 =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                10,
                                5
                        )
                );

        JButton submit =
                new JButton("Submit");

        submit.setBackground(
                new Color(100, 200, 100)
        );

        submit.setForeground(
                Color.WHITE
        );

        submit.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        JButton cancel =
                new JButton("Cancel");

        row7.add(submit);
        row7.add(cancel);

        frame.add(row7);

        // =====================================================
        // DISPLAY WINDOW
        // =====================================================

        frame.setVisible(true);

        System.out.println(
                "Components displayed on: "
                        + Thread.currentThread().getName()
        );
    }
}