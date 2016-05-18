package by.epam.mypackage.service;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;

public interface HotelService {
    void authorization(String login, String password) throws ServiceException;
    void registration(String login, String password, UserInfo usersInfo) throws ServiceException;
    void removeUser(int userId) throws ServiceException;
    void addRoom(Room room) throws ServiceException;
    List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws ServiceException;
    void reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws ServiceException;
}
