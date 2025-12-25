package mainapp;

public class Employee extends User {
    protected String employeeID;
    protected String contactInfo;

    public Employee(String userID, String name, String username, String password, String employeeID, String contactInfo) {
        super(userID, name, username, password);
        this.employeeID = employeeID;
        this.contactInfo = contactInfo;
    }
}
