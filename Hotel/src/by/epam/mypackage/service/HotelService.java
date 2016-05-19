package by.epam.mypackage.service;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;


public interface HotelService {
    boolean removeUser(int userId) throws ServiceException;

    boolean addRoom(Room room) throws ServiceException;

    boolean removeRoom(int roomId) throws ServiceException;

    boolean editUserInfo(String login, String password, UserInfo userInfo) throws ServiceException;
}
