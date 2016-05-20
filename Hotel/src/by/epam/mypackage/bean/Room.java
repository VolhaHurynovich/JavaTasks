package by.epam.mypackage.bean;

public class Room {
    private String roomNumber;
    private String roomType;
    private int roomNumOfAdult;
    private int roomNumOfChild;
    private double roomPriceDay;
    private String roomStatus;

    public Room(String roomNumber, String roomType,
                int roomNumOfAdult, int roomNumOfChild, double roomPriceDay, String roomStatus) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomNumOfAdult = roomNumOfAdult;
        this.roomNumOfChild = roomNumOfChild;
        this.roomPriceDay = roomPriceDay;
        this.roomStatus = roomStatus;
    }
    public Room() {
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumOfAdult() {
        return roomNumOfAdult;
    }

    public void setRoomNumOfAdult(int roomNumOfAdult) {
        this.roomNumOfAdult = roomNumOfAdult;
    }

    public int getRoomNumOfChild() {
        return roomNumOfChild;
    }

    public void setRoomNumOfChild(int roomNumOfChild) {
        this.roomNumOfChild = roomNumOfChild;
    }

    public double getRoomPriceDay() {
        return roomPriceDay;
    }

    public void setRoomPriceDay(double roomPriceDay) {
        this.roomPriceDay = roomPriceDay;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
