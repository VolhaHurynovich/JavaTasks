package by.epam.mypackage.bean;

public class Room {
    private int roomId;
    private String roomType;
    private int roomNumOfAdult;
    private int roomNumOfChild;
    private double roomPriceDay;
    private String roomStatus;

    public Room(int roomId, String roomType, int roomNumOfAdult, int roomNumOfChild,
                double roomPriceDay, String roomStatus) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomNumOfAdult = roomNumOfAdult;
        this.roomNumOfChild = roomNumOfChild;
        this.roomPriceDay = roomPriceDay;
        this.roomStatus = roomStatus;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
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
}
