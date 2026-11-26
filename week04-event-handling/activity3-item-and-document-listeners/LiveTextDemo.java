// ============================================================
// DOCUMENT LISTENER DEMO
// ============================================================
// Demonstrates:
//
// JTextField
// DocumentListener
//
// The label updates automatically while
// the user types.
// ============================================================

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class LiveTextDemo {

    private static JLabel previewLabel;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                LiveTextDemo::createAndShow
        );
    }

    private static void createAndShow() {

        JFrame frame =
                new JFrame(
                        "Live Text Preview"
                );

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(500, 250);

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new GridLayout(
                        3,
                        1,
                        10,
                        10
                )
        );

        // =====================================================
        // TEXT FIELD
        // =====================================================

        JTextField nameField =
                new JTextField();

        // =====================================================
        // PREVIEW LABEL
        // =====================================================

        previewLabel =
                new JLabel(
                        "Start typing...",
                        SwingConstants.CENTER
                );

        previewLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16
                )
        );

        // =====================================================
        // DOCUMENT LISTENER
        // =====================================================

        nameField.getDocument()
                .addDocumentListener(
                        new DocumentListener() {

                            @Override
                            public void insertUpdate(
                                    DocumentEvent e
                            ) {
                                updatePreview(
                                        nameField
                                );
                            }

                            @Override
                            public void removeUpdate(
                                    DocumentEvent e
                            ) {
                                updatePreview(
                                        nameField
                                );
                            }

                            @Override
                            public void changedUpdate(
                                    DocumentEvent e
                            ) {
                                updatePreview(
                                        nameField
                                );
                            }
                        }
                );

        frame.add(
                new JLabel(
                        "Enter Your Name:",
                        SwingConstants.CENTER
                )
        );

        frame.add(nameField);

        frame.add(previewLabel);

        frame.setVisible(true);
    }

    private static void updatePreview(
            JTextField field
    ) {

        String text =
                field.getText();

        if (text.isEmpty()) {

            previewLabel.setText(
                    "Start typing..."
            );

        } else {

            previewLabel.setText(
                    "Hello, " + text + " 💖"
            );
        }
    }
}