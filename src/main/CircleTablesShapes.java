package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CircleTablesShapes extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure parent component is painted
        Graphics2D g2 = (Graphics2D) g;

        // Draw a circle
        g2.setColor(Color.RED);
        g2.fillOval(10, 10, 128, 128); // Fill a circle
        // g2.setColor(Color.BLACK);
        // g2.drawOval(10, 10, 128, 128); // Draw the outline

    }    
}
