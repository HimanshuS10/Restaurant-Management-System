package main;

import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;

public class TablesShapes extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100, 150, 60, 200);
    }
}
