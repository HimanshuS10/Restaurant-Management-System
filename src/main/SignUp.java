package main;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Users;

public class SignUp {
    
    public SignUp(ArrayList<Users> User) {
        JFrame tableSetUp = new JFrame();
        setSize(800, 600);

        tableSetUp.setVisible(true);

        JLabel asd = new JLabel("Table Set Up");
        tableSetUp.add(asd);
    }



}
