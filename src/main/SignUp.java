package main;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Users;
import java.awt.*;

public class SignUp {

    private JFrame SignUpFrame;
    private Font plainFont = new Font("Arial", Font.PLAIN, 30);
    private Font boldFont = new Font("Arial", Font.BOLD, 32);
    private Color Purple = new Color(111, 55, 255);
    private Color Background = new Color(224, 224, 255);
    private ArrayList<Users> userList;

    public SignUp(ArrayList<Users> User) {

        this.userList = User;

        SignUpFrame.setTitle("Restaurant Management System");
        SignUpFrame.setSize(800, 600);

        // Initialize class-level variables
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add the login page to the main panel
        SignUpFrame.add(signUpPage(), "LoginPage");

        // Add mainPanel to the frame
        add(SignUpFrame);

        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JPanel signUpPage() {
        JPanel loginPage = new JPanel();
        loginPage.setLayout(null); // Use null layout for custom positioning
        loginPage.setBackground(Background);

        return loginPage;
    }

}
