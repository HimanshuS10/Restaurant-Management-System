package main;

import javax.swing.border.LineBorder;

import models.Users;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel signUpPage;
    private JLabel Error;

    private JTextField userNameField;
    private JTextField passwordField;

    private Font plainFont = new Font("Arial", Font.PLAIN, 30);
    private Font boldFont = new Font("Arial", Font.BOLD, 32);
    private Color Purple = new Color(111, 55, 255);
    private Color Background = new Color(224, 224, 255);
    private ArrayList<Users> userList;


    public Login(ArrayList<Users> User) {

        this.userList = User; 

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

        userNameField = new JTextField();
        userNameField.setBounds(249, 253, 389, 46);
        userNameField.setFont(new Font("Arial", Font.PLAIN, 20)); // Set font to Arial and size 20
        loginPage.add(userNameField);

        // Add Password Label and Field
        JLabel password = new JLabel("Password:");
        password.setFont(plainFont);
        password.setBounds(55, 354, 200, 40);
        loginPage.add(password);

        passwordField = new JPasswordField(20);
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
        loginButton.addActionListener(new LoginListener());
        
        JButton signupButton = new JButton("Sign Up");
        signupButton.setForeground(Color.BLACK);
        signupButton.setFont(plainFont);
        signupButton.setBounds(305, 431, 232, 63);
        signupButton.setBackground(Background);
        signupButton.setBorder(new LineBorder(Purple, 5));
        loginPage.add(signupButton);
        signupButton.addActionListener(new SignUpListener());
        
        Error = new JLabel("");
        Error.setBounds(57, 399, 200, 50);
        Error.setForeground(Color.RED);
        loginPage.add(Error);

        loginPage.add(signupButton);

        return loginPage;
    }

    public class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String userName = userNameField.getText();
            String password = passwordField.getText();

            if (userList.size() == 0) {
                Error.setText("No users in the database, please sign up");
                return;
            }

            for (Users user : userList) {

                String dbUser = user.getUserName();
                String dbPass = user.getPassword();

                if (dbUser.equals(userName) && dbPass.equals(password)) {
                    System.out.println("Login Successful");
                    TableSetUp tableSetUp = new TableSetUp();
                    tableSetUp.setVisible(true);
                    dispose();
                    return;
                } else {
                    System.out.println("Login Failed");
                }

            }
            System.out.println("User not found");

        }
        
    }

    public class SignUpListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            SignUp signUp = new SignUp(userList);
            dispose();
        }
    }


}