package main;

import models.Users;
import java.util.ArrayList;


public class Main {
    private static ArrayList<Users> User = new ArrayList<>(20);


    public static void main(String[] args) {

        Users temp = new Users("Joe", "123", "123");
        User.add(temp);


        Login gui = new Login(User);
        gui.setVisible(true);
    }
}
