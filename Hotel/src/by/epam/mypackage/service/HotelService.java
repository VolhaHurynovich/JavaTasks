package by.epam.mypackage.service;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;


public interface HotelService {
    boolean removeUser(int userId) throws ServiceException;

    boolean addRoom(Room room) throws ServiceException;

    boolean removeRoom(int roomId) throws ServiceException;

    boolean editUserInfo(int userId, String userFirstName, String userLastName, String userNumPassport,
                         String userAddress, String userEmail, String userPhone) throws ServiceException;

    List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws ServiceException;

    boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws ServiceException;
}
