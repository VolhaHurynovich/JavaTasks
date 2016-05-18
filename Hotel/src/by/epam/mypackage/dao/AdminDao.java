package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;

public interface AdminDao {
    void blockUser(int idUser);
    void addRoom(Room room);
}
