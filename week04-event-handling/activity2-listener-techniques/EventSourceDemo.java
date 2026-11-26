// ============================================================
// EVENT SOURCE DEMO
// ============================================================
// Multiple buttons share ONE listener.
//
// The listener identifies which button
// generated the event.
// ============================================================

import javax.swing.*;
import java.awt.*;

public class EventSourceDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                EventSourceDemo::createAndShow
        );
    }

    private static void createAndShow() {

        JFrame frame =
                new JFrame(
                        "Event Source Demo"
                );

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(500, 250);

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new FlowLayout()
        );

        // =====================================================
        // BUTTONS
        // =====================================================

        JButton pinkButton =
                new JButton("🌸 Pink");

        JButton pearlButton =
                new JButton("💎 Pearl");

        JButton royalButton =
                new JButton("👑 Royal");

        // =====================================================
        // SHARED LISTENER
        // =====================================================

        var listener =
                new java.awt.event.ActionListener() {

                    @Override
                    public void actionPerformed(
                            java.awt.event.ActionEvent e
                    ) {

                        Object source =
                                e.getSource();

                        if (source == pinkButton) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Pink button clicked!"
                            );

                        } else if (source == pearlButton) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Pearl button clicked!"
                            );

                        } else if (source == royalButton) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Royal button clicked!"
                            );
                        }
                    }
                };

        pinkButton.addActionListener(listener);
        pearlButton.addActionListener(listener);
        royalButton.addActionListener(listener);

        frame.add(pinkButton);
        frame.add(pearlButton);
        frame.add(royalButton);

        frame.setVisible(true);
    }
}