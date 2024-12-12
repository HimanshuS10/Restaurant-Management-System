package main;

import models.Users;
import java.util.ArrayList;


public class Main {
    private static ArrayList<Users> User = new ArrayList<>(20);

    public static void main(String[] args) {
        Login gui = new Login(User);
        gui.setVisible(true);
    }
}
