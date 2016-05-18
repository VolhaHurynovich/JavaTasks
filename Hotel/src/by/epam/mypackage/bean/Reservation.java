package by.epam.mypackage.bean;

import java.util.Date;

public class Reservation {
    private int resId;
    private int userId;
    private int roomId;
    private Date dateIn;
    private Date dateOut;
    private String resStatus;

    public Reservation(int resId, int userId, int roomId, Date dateIn, Date dateOut, String resStatus) {
        this.resId = resId;
        this.userId = userId;
        this.roomId = roomId;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.resStatus = resStatus;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public String getResStatus() {
        return resStatus;
    }

    public void setResStatus(String resStatus) {
        this.resStatus = resStatus;
    }
}
