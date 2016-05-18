package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;

public interface AdminDao {
    void removeUser(int userId) throws DAOException;
    void addRoom(Room room) throws DAOException;
}
