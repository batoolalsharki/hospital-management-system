package mainapp;

public abstract class User {
    protected String userID;
    protected String name;
    protected String username;
    protected String password;

    public User(String userID, String name, String username, String password) {
        this.userID = userID;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public String toString() {
        return "User: " + name + " (ID: " + userID + ")";
    }
}
