package main;

import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;

class SquareTablesShapes extends JComponent {

    private Color Green = new Color(113, 185, 58);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure parent component is painted
        Graphics2D g2 = (Graphics2D) g;

        // Draw a square
        g2.setColor(Green);
        g2.fillRect(10, 10, 128, 128); // Fill a square
        g2.setColor(Color.BLACK);
        // g2.drawRect(100, 100, 100, 100); // Draw the outline
        g2.drawRect(10, 10, 128, 128);

    }
}
