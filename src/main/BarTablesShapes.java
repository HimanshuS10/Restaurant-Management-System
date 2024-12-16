package main;

import javax.swing.JComponent;

public class BarTablesShapes extends JComponent {

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g); // Ensure parent component is painted
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;

        // Draw a rectangle
        g2.setColor(new java.awt.Color(113, 185, 58));
        g2.fillRect(10, 10, 320, 70); // Fill a rectangle
        g2.setColor(java.awt.Color.BLACK);
        g2.drawRect(10, 10, 320, 70); // Draw the outline

    }
    
}
