package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.User;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;

public interface CommonDao {
    User authorization(String login, String password) throws DAOException;
    int registration(String userName, String userPassword,  String userFirstName,
                     String userLastName, String userNumPassport, String userAddress, String userPhone) throws DAOException;
    List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws DAOException;
    boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws DAOException;
}
