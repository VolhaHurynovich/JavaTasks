package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;

public interface AdminDao {
    boolean editStatusNameToAdmin(int userId) throws DAOException;
    boolean removeUser(int userId) throws DAOException;
    boolean addRoom(Room room) throws DAOException;
    boolean removeRoom(int roomId) throws DAOException;
}
