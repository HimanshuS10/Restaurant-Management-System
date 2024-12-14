package models;

public class Users {

    private String FullName;
    private String UserName;
    private String Password;
    private int EmployeeID;

    public Users(String FullName, String UserName, String Password) {
        this.FullName = FullName;
        this.UserName = UserName;
        this.Password = Password;
    }

    public int getEmployeeID() {
        return this.EmployeeID;
    }

    public String getFullName() {
        return this.FullName;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getPassword() {
        return this.Password;
    }
    
}
