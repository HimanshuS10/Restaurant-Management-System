package main;

import javax.swing.*;
import java.awt.*;

public class TableSetUp extends JFrame {

    private Color Background = new Color(37, 40, 54);
    private Color Pink = new Color(234, 105, 105);

    public TableSetUp() {
        // Sets the title of the window
        setTitle("Restaurant Management System - Table Set Up");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        menuBar.setBackground(Pink);

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

        tableSetUpPage.setBackground(Background);
        
        JLabel title = new JLabel("Table Set Up Page");
        title.setBounds(10, 10, 200, 30);
        tableSetUpPage.add(title);

        title.setForeground(Color.WHITE);

        /*
         * Table Set Up
         * 
         * T1 T3
         * T2 T4
         */

        SquareTablesShapes square_table1 = new SquareTablesShapes();
        square_table1.setBounds(51, 76, 110, 110);
        tableSetUpPage.add(square_table1);

        SquareTablesShapes square_table2 = new SquareTablesShapes();
        square_table2.setBounds(51, 241, 110, 110);
        tableSetUpPage.add(square_table2);

        SquareTablesShapes square_table3 = new SquareTablesShapes();
        square_table3.setBounds(220, 76, 110, 110);
        tableSetUpPage.add(square_table3);

        SquareTablesShapes square_table4 = new SquareTablesShapes();
        square_table4.setBounds(220, 241, 110, 110);
        tableSetUpPage.add(square_table4);

        return tableSetUpPage;
    }

}