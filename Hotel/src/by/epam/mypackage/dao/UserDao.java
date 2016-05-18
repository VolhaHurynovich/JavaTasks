package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;

import java.util.Date;
import java.util.List;

public interface UserDao {
    List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws DAOException;
    void reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws DAOException;
}
