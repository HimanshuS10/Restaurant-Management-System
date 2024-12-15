package main;

import javax.swing.*;
import java.awt.*;

public class TableSetUp extends JFrame {

    public TableSetUp() {
        // Sets the title of the window
        setTitle("Restaurant Management System - Table Set Up");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        // Add the setup page to the frame
        getContentPane().add(TableSetUpPage());

        setVisible(true); // Make the frame visible
    }

    public JPanel TableSetUpPage() {
        JPanel tableSetUpPage = new JPanel();
        tableSetUpPage.setLayout(null); // Use absolute positioning

        JLabel title = new JLabel("Table Set Up Page");
        title.setBounds(10, 10, 200, 30); // Position the label
        tableSetUpPage.add(title);

        // Add the TablesShapes component
        TablesShapes tablesShapes = new TablesShapes();
        tablesShapes.setBounds(50, 50, 700, 500); // Set the bounds of the drawing area
        tableSetUpPage.add(tablesShapes);

        return tableSetUpPage;
    }

    public static void main(String[] args) {
        new TableSetUp();
    }
}

class TablesShapes extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure parent component is painted
        Graphics2D g2 = (Graphics2D) g;

        // Draw a square
        g2.setColor(Color.BLUE);
        g2.fillRect(100, 100, 100, 100); // Fill a square
        g2.setColor(Color.BLACK);
        g2.drawRect(100, 100, 100, 100); // Draw the outline
    }
}
