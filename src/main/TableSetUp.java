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


        JMenuBar menuBar = new JMenuBar();  
        JMenu menu =new JMenu("Menu");  

        JMenuItem i1 = new JMenuItem("Home");
        JMenuItem i2 = new JMenuItem("Book a Table");
        JMenuItem i3 = new JMenuItem("Order");
        JMenuItem i4 = new JMenuItem("Check Out");
        JMenuItem i5 = new JMenuItem("Log Out");
    
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menuBar.add(menu);

        setJMenuBar(menuBar);
        // Add the setup page to the frame
        getContentPane().add(TableSetUpPage());

        setVisible(true); // Make the frame visible
    }

    public JPanel TableSetUpPage() {
        JPanel tableSetUpPage = new JPanel();
        tableSetUpPage.setLayout(null); 

        JLabel title = new JLabel("Table Set Up Page");
        title.setBounds(10, 10, 200, 30); 
        tableSetUpPage.add(title);

        TablesShapes tablesShapes = new TablesShapes();
        tablesShapes.setBounds(82, 128, 128, 128);
        tableSetUpPage.add(tablesShapes);

        return tableSetUpPage;
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
