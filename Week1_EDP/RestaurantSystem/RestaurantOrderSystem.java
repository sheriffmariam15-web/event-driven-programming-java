package RestaurantSystem;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;  

    
public class RestaurantOrderSystem {
    
    private JFrame frame;
    private JPanel panel;
    private ArrayList<String> orders = new ArrayList<>();

    public RestaurantOrderSystem() {
        frame = new JFrame("Restaurant Order System");
        panel = new JPanel();

        setupUI(); 
    }   
    private void setupUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Restaurant Order System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(titleLabel, BorderLayout.NORTH);

        JLabel countLabel = new JLabel ("Orders: 0");
        countLabel.setText("Orders: " + orders.size());

        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JButton orderButton = new JButton("Place Order");
        JButton viewOrdersButton = new JButton("View Orders");
        JButton exitButton = new JButton("Exit");

        panel.add(orderButton);
        panel.add(viewOrdersButton);
        panel.add(exitButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(countLabel, BorderLayout.SOUTH);

        // I'm tirrrrrrrrrrreeeeeeeddddddd!!!
        orderButton.addActionListener(e -> {
            String order = JOptionPane.showInputDialog(frame, "Enter your order:");
            if (order != null && !order.trim().isEmpty()) {
                orders.add(order);
                countLabel.setText("Orders: " + orders.size());
                JOptionPane.showMessageDialog(
                    frame,
                    "Order placed: " + order);
            }
    });

        // View Orders Button Action Listener
        viewOrdersButton.addActionListener(e -> {
            if (orders.isEmpty()) {
            JOptionPane.showMessageDialog(
                frame,
                "No orders have been placed yet.");
            } else {
            JOptionPane.showMessageDialog(
                frame,  
                orders.toString()
            );
            }
        });

        // Exit Button Action Listener
        exitButton.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(
                frame, "Are you sure you want to exit?",
                "Exit Confirmation",
                JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                frame.dispose();
            }   
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RestaurantOrderSystem());
    }       
}

