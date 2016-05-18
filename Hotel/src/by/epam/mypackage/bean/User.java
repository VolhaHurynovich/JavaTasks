package by.epam.mypackage.bean;


public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private String userStatusName;

    public User(int userId, String userStatusName, String userPassword, String userName) {
        this.userId = userId;
        this.userStatusName = userStatusName;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserStatusName() {
        return userStatusName;
    }

    public void setUserStatusName(String userStatusName) {
        this.userStatusName = userStatusName;
    }
}
