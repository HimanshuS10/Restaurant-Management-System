package main;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import main.Login.LoginListener;
import main.Login.SignUpListener;
import models.Users;
import java.awt.*;

public class SignUp extends JFrame {

    private CardLayout cardLayout;
    private JPanel signupPanel;
    private JFrame signUpPage;

    private JFrame SignUpFrame;
    private Font plainFont = new Font("Arial", Font.PLAIN, 30);
    private Font boldFont = new Font("Arial", Font.BOLD, 32);
    private Color Purple = new Color(111, 55, 255);
    private Color Background = new Color(224, 224, 255);
    private ArrayList<Users> userList;

    public SignUp(ArrayList<Users> User) {

        signUpPage = new JFrame();
        this.userList = User;

        SignUpFrame.setTitle("Restaurant Management System");
        SignUpFrame.setSize(800, 600);

        // Initialize class-level variables
        cardLayout = new CardLayout();
        signupPanel = new JPanel(cardLayout);

        // Add the login page to the main panel
        SignUpFrame.add(signUpPage(), "LoginPage");

        // Add mainPanel to the frame
        SignUpFrame.add(signupPanel);

        SignUpFrame.setResizable(false);
        SignUpFrame.setLocationRelativeTo(null);
        SignUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel signUpPage() {

        JPanel signUpPage = new JPanel();
        signUpPage.setLayout(null);
        signUpPage.setBackground(Background);

        return signUpPage;
    }

}
