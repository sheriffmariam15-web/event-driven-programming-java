// ============================================================
// BORDERLAYOUT DEMO
// ============================================================
// BorderLayout divides a window into 5 regions:
//
// NORTH
// SOUTH
// EAST
// WEST
// CENTER
//
// The CENTER region automatically expands
// and takes any remaining space.
// ============================================================

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame =
                    new JFrame("BorderLayout Demo");

            frame.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE);

            frame.setSize(500, 400);

            frame.setLocationRelativeTo(null);

            // BorderLayout with 5px gaps
            frame.setLayout(
                    new BorderLayout(5, 5)
            );

            // NORTH
            frame.add(
                    new JButton("NORTH"),
                    BorderLayout.NORTH
            );

            // SOUTH
            frame.add(
                    new JButton("SOUTH"),
                    BorderLayout.SOUTH
            );

            // EAST
            frame.add(
                    new JButton("EAST"),
                    BorderLayout.EAST
            );

            // WEST
            frame.add(
                    new JButton("WEST"),
                    BorderLayout.WEST
            );

            // CENTER
            frame.add(
                    new JButton("Mariam's Center"),
                    BorderLayout.CENTER
            );

            frame.setVisible(true);

            System.out.println(
                    "BorderLayout running on: "
                    + Thread.currentThread().getName()
            );
        });
    }
}
