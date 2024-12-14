package main;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TableSetUp extends JFrame {

    public TableSetUp() {
        // this.userList = User;

        // Sets the title of the window
        setTitle("Restaurant Management System - Table Set Up");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        // Add the signup page to the frame
        getContentPane().add(TableSetUpPage());

        setVisible(true); // Make the frame visible
    }

    public JPanel TableSetUpPage() {
        JPanel tableSetUpPage = new JPanel();
        
        JLabel asd = new JLabel("Table Set Up Page");
        tableSetUpPage.add(asd);
    
        tableSetUpPage.getRootPane().add(new TablesShapes());

        tableSetUpPage.setLayout(null);

        
        return tableSetUpPage;
    }

}
