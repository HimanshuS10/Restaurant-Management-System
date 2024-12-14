package main;

import javax.swing.*;
import javax.swing.border.LineBorder;

import main.Login.SignUpListener;
import models.Users;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignUp extends JFrame {

    private JTextField fullNameField;
    private JTextField userNameField;
    private JTextField passwordField;
    private JLabel ErrorMessage;

    private Font plainFont = new Font("Arial", Font.PLAIN, 30);
    private Font boldFont = new Font("Arial", Font.BOLD, 32);

    private Color Pink = new Color(234, 105, 105);
    private Color Background = new Color(37, 40, 54);
    private ArrayList<Users> userList;

    public SignUp(ArrayList<Users> User) {
        this.userList = User;

        // Sets the title of the window
        setTitle("Restaurant Management System - Sign Up");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        // Add the signup page to the frame
        getContentPane().add(signUpPage());

        setVisible(true); // Make the frame visible
    }

    public JPanel signUpPage() {
        JPanel signUpPage = new JPanel();
        signUpPage.setLayout(null); // Custom positioning
        signUpPage.setBackground(Background);

        JLabel title = new JLabel("Sign Up");
        title.setFont(boldFont);
        title.setForeground(Color.WHITE);
        title.setBounds(38, 35, 166, 51); // Position
        signUpPage.add(title);

        JLabel fullNameLabel = new JLabel("Full Name");
        fullNameLabel.setFont(plainFont);
        fullNameLabel.setForeground(Color.WHITE);
        fullNameLabel.setBounds(38, 126, 176, 41);
        signUpPage.add(fullNameLabel);

        fullNameField = new JTextField(20);
        fullNameField.setFont(plainFont);
        fullNameField.setBounds(226, 124, 390, 46);
        signUpPage.add(fullNameField);

        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setFont(plainFont);
        userNameLabel.setForeground(Color.WHITE);
        userNameLabel.setBounds(38, 217, 179, 41);
        signUpPage.add(userNameLabel);

        userNameField = new JTextField(20);
        userNameField.setFont(plainFont);
        userNameField.setBounds(233, 215, 390, 46);
        signUpPage.add(userNameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(plainFont);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(38, 308, 179, 41);
        signUpPage.add(passwordLabel);

        passwordField = new JTextField(20);
        passwordField.setFont(plainFont);
        passwordField.setBounds(226, 307, 390, 47);
        signUpPage.add(passwordField);

        ErrorMessage = new JLabel("");
        ErrorMessage.setForeground(Color.RED);
        ErrorMessage.setBounds(38, 363, 550, 26);
        signUpPage.add(ErrorMessage);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setFont(plainFont);
        signUpButton.setBounds(284, 399, 231, 62);
        signUpButton.setBackground(Pink);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBorder(new LineBorder(Color.WHITE, 2));
        signUpPage.add(signUpButton);
        signUpButton.addActionListener(new SignUpListener());

        JButton goBackButton = new JButton("← Go Back");
        goBackButton.setForeground(Color.WHITE);
        goBackButton.setFont(plainFont);
        goBackButton.setBounds(38, 399, 231, 62);
        goBackButton.setBackground(Background);
        goBackButton.setBorder(new LineBorder(Pink, 5));
        signUpPage.add(goBackButton);
        goBackButton.addActionListener(new GoBackListener());

        return signUpPage;
    }

    public class SignUpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String FullName = fullNameField.getText();
            String UserName = userNameField.getText();
            String Password = passwordField.getText();

            if (FullName.isEmpty()) {
                ErrorMessage.setText("Please enter your full name");
            } else if (UserName.isEmpty()) {
                ErrorMessage.setText("Please enter a username");
            } else if (Password.isEmpty()) {
                ErrorMessage.setText("Please enter a password");
            } else {
                System.out.println("Full Name: " + FullName);
                System.out.println("Username: " + UserName);
                System.out.println("Password: " + Password);
                Users newUser = new Users(FullName, UserName, Password);
                userList.add(newUser);
                dispose();
                Login login = new Login(userList);
                login.setVisible(true);
            }

        }
    }

    public class GoBackListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
            Login login = new Login(userList);
            login.setVisible(true);
        }
    }

}