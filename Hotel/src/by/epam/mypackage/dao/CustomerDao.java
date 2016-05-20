package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;

public interface CustomerDao {
    boolean editUserInfo(int userId,  String userFirstName, String userLastName,
                         String userNumPassport, String userAddress,String userEmail, String userPhone) throws DAOException;
    List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws DAOException;
    boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws DAOException;
}
