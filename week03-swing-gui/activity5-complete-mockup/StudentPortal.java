import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

// ============================================================
// STUDENT PORTAL DASHBOARD
// ============================================================
// Complete Swing mockup combining:
//
// BorderLayout
// GridLayout
// BoxLayout
//
// This resembles a real university portal.
// ============================================================

public class StudentPortal {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                StudentPortal::createAndShow
        );
    }

    private static void createAndShow() {

        // =====================================================
        // 1. MAIN WINDOW
        // =====================================================

        JFrame frame =
                new JFrame(
                        "♡ Mariam's Pearl Dashboard ♡"
                );

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(900, 600);

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new BorderLayout()
        );

        // =====================================================
        // 2. HEADER
        // =====================================================

        JPanel header =
                new JPanel(
                        new BorderLayout()
                );

        header.setBackground(
                new Color(255, 182, 193)
        ); // Light pink color

        header.setBorder(
                new EmptyBorder(
                        10,
                        15,
                        10,
                        15
                )
        );

        JLabel title =
                new JLabel(
                        "♡ Mariam's Pearl Dashboard ♡"
                );

        title.setForeground(Color.WHITE);

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );

        JButton logoutButton =
                new JButton("Logout");

        logoutButton.setBackground(
                new Color(255, 105, 180)
        );

        logoutButton.setForeground(
                Color.WHITE
        );

        logoutButton.setFocusPainted(false);

        header.add(
                title,
                BorderLayout.WEST
        );

        header.add(
                logoutButton,
                BorderLayout.EAST
        );

        frame.add(
                header,
                BorderLayout.NORTH
        );

        // =====================================================
        // 3. SIDEBAR
        // =====================================================

        JPanel sidebar =
                new JPanel(
                        new GridLayout(
                                6,
                                1,
                                5,
                                5
                        )
                );

        sidebar.setPreferredSize(
                new Dimension(
                        180,
                        0
                )
        );

        sidebar.setBackground(
                new Color(
                        255,
                        248,
                        250
                )
        ); //Pearl White

        sidebar.setBorder(
                new EmptyBorder(
                        15,
                        10,
                        15,
                        10
                )
        );
        String[] menuItems = {

        "♡ Dashboard",
        "🎀 Courses",
        "🌷 Grades",
        "💎 Fees",
        "🦢 Timetable",
        "✨ Messages"
};

        for (String item : menuItems) {

            JButton btn =
                    new JButton(item);

            btn.setHorizontalAlignment(
                    SwingConstants.LEFT
            );

            btn.setBackground(
                    Color.WHITE
            );

            btn.setFocusPainted(false);

            sidebar.add(btn);
        }

        frame.add(
                sidebar,
                BorderLayout.WEST
        );

        // =====================================================
        // 4. CONTENT AREA
        // =====================================================

        JPanel content =
                new JPanel();

        content.setLayout(
                new BoxLayout(
                        content,
                        BoxLayout.Y_AXIS
                )
        );

        content.setBorder(
                new EmptyBorder(
                        20,
                        20,
                        20,
                        20
                )
        );

        content.setBackground(
                Color.WHITE
        );

        JLabel welcome =
                new JLabel(
                        "Welcome, Mariam ♡"
                );

        welcome.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        22
                )
        );

        welcome.setAlignmentX(
                Component.LEFT_ALIGNMENT
        );

        content.add(welcome);

        content.add(
                Box.createVerticalStrut(20)
        );

        // =====================================================
        // STAT CARDS
        // =====================================================

        JPanel cardsPanel =
                new JPanel(
                        new GridLayout(
                                1,
                                3,
                                15,
                                15
                        )
                );

        cardsPanel.setMaximumSize(
                new Dimension(
                        Integer.MAX_VALUE,
                        100
                )
        );

        cardsPanel.setAlignmentX(
                Component.LEFT_ALIGNMENT
        );

        cardsPanel.add(
                createStatCard(
                        "GPA",
                        "3.75",
                        new Color(
                                255,
                                192,
                                203
                        )
                )
        );

        cardsPanel.add(
                createStatCard(
                        "Units",
                        "48 / 56",
                        new Color(
                                255,
                                105,
                                180
                        )
                )
        );

        cardsPanel.add(
                createStatCard(
                        "Fees",
                        "Paid",
                        new Color(
                                255,
                                218,
                                224
                        )
                )
        );

        content.add(cardsPanel);

        content.add(
                Box.createVerticalStrut(30)
        );

        // =====================================================
        // NOTIFICATIONS
        // =====================================================

        JLabel notifTitle =
                new JLabel(
                        "Notifications"
                );

        notifTitle.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16
                )
        );

        notifTitle.setAlignmentX(
                Component.LEFT_ALIGNMENT
        );

        content.add(notifTitle);

        content.add(
                Box.createVerticalStrut(10)
        );

       String[] notifications = {

        "♡ Assignment due Friday",
        "🎀 New course materials uploaded",
        "🌷 GPA updated successfully",
        "💎 Welcome to your Pearl Dashboard"
};

        for (String note : notifications) {

            JLabel noteLabel =
                    new JLabel(note);

            noteLabel.setFont(
                    new Font(
                            "Segoe UI",
                            Font.PLAIN,
                            14
                    )
            );

            noteLabel.setAlignmentX(
                    Component.LEFT_ALIGNMENT
            );

            content.add(noteLabel);

            content.add(
                    Box.createVerticalStrut(5)
            );
            content.setBackground(
        new Color(
                255,
                245,
                247
        )
);
        }

        frame.add(
                content,
                BorderLayout.CENTER
        );

        // =====================================================
        // STATUS BAR
        // =====================================================

        JPanel statusBar =
                new JPanel(
                        new BorderLayout()
                );

        statusBar.setBackground(
                new Color(
                        230,
                        230,
                        235
                )
        );

        statusBar.setBorder(
                new EmptyBorder(
                        5,
                        10,
                        5,
                        10
                )
        );

        statusBar.add(

                new JLabel(
                        "Status: Logged in"
                ),

                BorderLayout.WEST
        );

        statusBar.add(

                new JLabel(
                        "Last login: Today"
                ),

                BorderLayout.EAST
        );

        frame.add(
                statusBar,
                BorderLayout.SOUTH
        );

        // =====================================================
        // DISPLAY
        // =====================================================

        frame.setVisible(true);

        System.out.println(
                "Mockup running on: "
                        + Thread.currentThread().getName()
        );
    }

    // =========================================================
    // HELPER METHOD
    // =========================================================

    private static JPanel createStatCard(

            String title,
            String value,
            Color color
    ) {

        JPanel card =
                new JPanel(
                        new BorderLayout()
                );

        card.setBackground(color);

        card.setBorder(
                new EmptyBorder(
                        15,
                        15,
                        15,
                        15
                )
        );

        JLabel titleLabel =
                new JLabel(title);

        titleLabel.setForeground(
                Color.WHITE
        );

        JLabel valueLabel =
                new JLabel(
                        value,
                        SwingConstants.RIGHT
                );

        valueLabel.setForeground(
                Color.WHITE
        );

        valueLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22
                )
        );

        card.add(
                titleLabel,
                BorderLayout.NORTH
        );

        card.add(
                valueLabel,
                BorderLayout.CENTER
        );

        return card;
    }
}