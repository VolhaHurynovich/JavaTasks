package by.epam.mypackage.bean;


public class UserInfo {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userNumPassport;
    private String userAddress;
    private String userPhone;

    public UserInfo(int userId, String userFirstName, String userLastName,
                    String userNumPassport, String userAdress, String userPhone) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userNumPassport = userNumPassport;
        this.userAddress = userAdress;
        this.userPhone = userPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserNumPassport() {
        return userNumPassport;
    }

    public void setUserNumPassport(String userNumPassport) {
        this.userNumPassport = userNumPassport;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
