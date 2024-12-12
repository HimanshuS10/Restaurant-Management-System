package models;

public class Users {

    private String FullName;
    private String UserName;
    private String Password;
    private int EmployeeID;
    private String Role;


    Users(String FullName, String UserName, String Password, int EmployeeID, String Role) {
        this.FullName = FullName;
        this.UserName = UserName;
        this.Password = Password;
        this.EmployeeID = EmployeeID;
        this.Role = Role;
    }


    
}
