package BugFixChallenge;
import javax.swing.*;

public class Bug1_BlockingEDT extends JFrame {

public JLabel statusLabel;
public JButton processButton;

public Bug1_BlockingEDT() {
setTitle("Bug 1 - Blocking EDT");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new java.awt.FlowLayout());

statusLabel = new JLabel("Ready");
processButton = new JButton("Process");

processButton.addActionListener(e -> {
// BUG: This blocks the EDT!
new Thread(() -> {
        try {
            Thread.sleep(5000); // Runs in the background; EDT stays completely free
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
     
        SwingUtilities.invokeLater(() -> {
            statusLabel.setText("Done!");
            processButton.setEnabled(true);
        });
    }).start(); // Starts the helper thread
statusLabel.setText("Done!");
});

add(statusLabel);
add(processButton);
setSize(300, 150);
setLocationRelativeTo(null);
}

public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new Bug1_BlockingEDT().setVisible(true);
});
}
}