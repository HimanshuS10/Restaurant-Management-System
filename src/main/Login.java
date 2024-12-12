package main;

import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel signUpPage;

    private Font plainFont = new Font("Arial", Font.PLAIN, 30);
    private Font boldFont = new Font("Arial", Font.BOLD, 32);
    private Color Purple = new Color(111, 55, 255);
    private Color Background = new Color(224, 224, 255);

    public Login() {
        setTitle("Restaurant Management System");
        setSize(800, 600);

        // Initialize class-level variables
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add the login page to the main panel
        mainPanel.add(loginPage(), "LoginPage");

        // Add mainPanel to the frame
        add(mainPanel);

        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JPanel loginPage() {
        // Create the login panel with a layout manager
        JPanel loginPage = new JPanel();
        loginPage.setLayout(null); // Use null layout for custom positioning
        loginPage.setBackground(Background);


        ImageIcon imageIcon = new ImageIcon("src/img/System.png");
        int originalWidth = imageIcon.getIconWidth();  // Original width of the image
        int originalHeight = imageIcon.getIconHeight(); // Original height of the image
        
        // Set the new height (smaller value)
        int newHeight = 100; // Example: new height is 100 pixels
        
        // Calculate the new width to maintain the aspect ratio
        int newWidth = (int) ((double) newHeight / originalHeight * originalWidth);
        
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH)));
        imageLabel.setBounds(55, 61, newWidth, newHeight);
        loginPage.add(imageLabel);
        
        // Add Title
        JLabel title = new JLabel("Restaurant Management System");
        title.setFont(boldFont);
        title.setBounds(55, 161, 691, 51); // Position title
        loginPage.add(title);

        // Add Username Label and Field
        JLabel userName = new JLabel("Username:");
        userName.setFont(plainFont);
        userName.setBounds(55, 252, 179, 41);
        loginPage.add(userName);

        JTextField userNameField = new JTextField();
        userNameField.setBounds(249, 253, 389, 46);
        userNameField.setFont(new Font("Arial", Font.PLAIN, 20)); // Set font to Arial and size 20
        loginPage.add(userNameField);

        // Add Password Label and Field
        JLabel password = new JLabel("Password:");
        password.setFont(plainFont);
        password.setBounds(55, 354, 200, 40);
        loginPage.add(password);

        JTextField passwordField = new JPasswordField(20);
        ((JPasswordField) passwordField).setEchoChar('*');
        passwordField.setBounds(249, 348, 389, 46);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20)); // Set font to Arial and size 20

        loginPage.add(passwordField);

        // Add Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(plainFont);
        loginButton.setBounds(55, 431, 232, 63);
        loginButton.setBackground(Purple);
        loginPage.add(loginButton);
        
        JButton signupButton = new JButton("Sign Up");
        signupButton.setForeground(Color.BLACK);
        signupButton.setFont(plainFont);
        signupButton.setBounds(305, 431, 232, 63);
        signupButton.setBackground(Background);
        signupButton.setBorder(new LineBorder(Purple, 5));

        signupButton.addActionListener(e -> cardLayout.show(signUpPage, "SignUpPage")); // Switch to Sign Up Page

        

        loginPage.add(signupButton);

        return loginPage;
    }

    public JPanel signUpPage() {
        signUpPage = new JPanel();
        signUpPage.setLayout(null);
        signUpPage.setBackground(Background);

        JLabel signUpTitle = new JLabel("Sign Up");
        signUpTitle.setFont(boldFont);
        signUpTitle.setBounds(55, 50, 691, 51);
        signUpPage.add(signUpTitle);

        // Add additional Sign Up fields here (e.g., username, password, confirm password)
        // Example:
        JLabel signUpUserName = new JLabel("Username:");
        signUpUserName.setFont(plainFont);
        signUpUserName.setBounds(55, 150, 179, 41);
        signUpPage.add(signUpUserName);

        JTextField signUpUserNameField = new JTextField();
        signUpUserNameField.setBounds(249, 150, 389, 46);
        signUpUserNameField.setFont(new Font("Arial", Font.PLAIN, 20));
        signUpPage.add(signUpUserNameField);

        // Add a button to go back to the login page
        JButton backButton = new JButton("Back to Login");
        backButton.setBounds(55, 350, 232, 63);
        backButton.setBackground(Purple);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(plainFont);
        
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "LoginPage")); // Switch back to Login Page

        signUpPage.add(backButton);

        return signUpPage;
    }
}