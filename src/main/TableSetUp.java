package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableSetUp extends JFrame {

    private Color Background = new Color(37, 40, 54);
    private Color Pink = new Color(234, 105, 105);

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public TableSetUp() {

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Sets the title of the window
        setTitle("Restaurant Management System - Table Set Up");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        JMenu menu = new JMenu("Menu");

        JMenuItem i1 = new JMenuItem("Home");
        i1.addActionListener(new HomeListener());
        menu.add(i1);

        JMenuItem i2 = new JMenuItem("Book a Table");
        i2.addActionListener(new BookTableListener());
        menu.add(i2);

        JMenuItem i3 = new JMenuItem("Order");
        i3.addActionListener(new OrderListener());
        menu.add(i3);

        JMenuItem i4 = new JMenuItem("Check Out");
        i4.addActionListener(new CheckOutListener());
        menu.add(i4);

        JMenuItem i5 = new JMenuItem("Log Out");
        i5.addActionListener(new LogoutListener());
        menu.add(i5);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        menuBar.setBackground(Pink);

        mainPanel.add(TableSetUpPage(), "TableSetUpPage");
        add(mainPanel);
        setResizable(false);

        BookTable bookTable = new BookTable();
        mainPanel.add(bookTable.bookTableGUI(), "Book a Table");

        Order order = new Order();
        mainPanel.add(order.OrderGUI(), "Order");

        Checkout checkOut = new Checkout();
        mainPanel.add(checkOut.CheckoutGUI(), "Check Out");

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
        square_table1.setToolTipText("Table 1");
        tableSetUpPage.add(square_table1);
        
        SquareTablesShapes square_table2 = new SquareTablesShapes();
        square_table2.setBounds(51, 241, 110, 110);
        square_table2.setToolTipText("Table 2");
        tableSetUpPage.add(square_table2);

        SquareTablesShapes square_table3 = new SquareTablesShapes();
        square_table3.setBounds(220, 76, 110, 110);
        square_table3.setToolTipText("Table 3");
        tableSetUpPage.add(square_table3);

        SquareTablesShapes square_table4 = new SquareTablesShapes();
        square_table4.setBounds(220, 241, 110, 110);
        square_table4.setToolTipText("Table 4");
        tableSetUpPage.add(square_table4);
        
        SquareTablesShapes square_table5 = new SquareTablesShapes();
        square_table5.setBounds(51, 406, 110, 110);
        square_table5.setToolTipText("Table 5");
        tableSetUpPage.add(square_table5);

        SquareTablesShapes square_table6 = new SquareTablesShapes();
        square_table6.setBounds(220, 406, 110, 110);
        square_table6.setToolTipText("Table 6");
        tableSetUpPage.add(square_table6);

        CircleTablesShapes circle_table1 = new CircleTablesShapes();
        circle_table1.setBounds(513, 68, 140, 140);
        circle_table1.setToolTipText("Table 5");
        tableSetUpPage.add(circle_table1);

   
        
        CircleTablesShapes circle_table2 = new CircleTablesShapes();
        circle_table2.setBounds(419, 232, 140, 140);
        circle_table2.setToolTipText("Table 6");
        tableSetUpPage.add(circle_table2);
        
        CircleTablesShapes circle_table3 = new CircleTablesShapes();
        circle_table3.setBounds(607, 232, 140, 140);
        circle_table3.setToolTipText("Table 7");
        tableSetUpPage.add(circle_table3);

        BarTablesShapes bar_table1 = new BarTablesShapes();
        bar_table1.setBounds(419, 480, 320, 70);
        bar_table1.setToolTipText("Table 8");
        tableSetUpPage.add(bar_table1);

        BarTablesSeat seat_1 = new BarTablesSeat();
        seat_1.setBounds(419, 435, 320, 70);
        seat_1.setToolTipText("Seat 1");
        tableSetUpPage.add(seat_1);

        BarTablesSeat seat_2 = new BarTablesSeat();
        seat_2.setBounds(469, 435, 320, 70);
        seat_2.setToolTipText("Seat 2");
        tableSetUpPage.add(seat_2);

        BarTablesSeat seat_3 = new BarTablesSeat();
        seat_3.setBounds(519, 435, 320, 70);
        seat_3.setToolTipText("Seat 3");
        tableSetUpPage.add(seat_3);

        BarTablesSeat seat_4 = new BarTablesSeat();
        seat_4.setBounds(569, 435, 320, 70);
        seat_4.setToolTipText("Seat 4");
        tableSetUpPage.add(seat_4);

        BarTablesSeat seat_5 = new BarTablesSeat();
        seat_5.setBounds(619, 435, 320, 70);
        seat_5.setToolTipText("Seat 5");
        tableSetUpPage.add(seat_5);

        BarTablesSeat seat_6 = new BarTablesSeat();
        seat_6.setBounds(669, 435, 320, 70);
        seat_6.setToolTipText("Seat 6");
        tableSetUpPage.add(seat_6);

        return tableSetUpPage;
    }


    private class HomeListener implements ActionListener {
        /**
         * Shows the Buy panel.
         * 
         * @param e the action event
         */
        public void actionPerformed(ActionEvent e) {
            // cardLayout.show(mainPanel, "Buy");
        }
    }

    
    private class BookTableListener implements ActionListener {
        /**
         * Shows the Buy panel.
         * 
         * @param e the action event
         */
        public void actionPerformed(ActionEvent e) {
            // cardLayout.show(mainPanel, "Buy");
        }
    }

    private class OrderListener implements ActionListener {
        /**
         * Shows the Buy panel.
         * 
         * @param e the action event
         */
        public void actionPerformed(ActionEvent e) {
            // cardLayout.show(mainPanel, "Buy");
        }
    }

    private class CheckOutListener implements ActionListener {
        /**
         * Shows the Buy panel.
         * 
         * @param e the action event
         */
        public void actionPerformed(ActionEvent e) {
            // cardLayout.show(mainPanel, "Buy");
        }
    }

    private class LogoutListener implements ActionListener {
        /**
         * Shows the Buy panel.
         * 
         * @param e the action event
         */
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }


}