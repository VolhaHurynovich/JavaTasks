package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.service.HotelService;
import by.epam.mypackage.service.ServiceException;

import java.util.Date;
import java.util.List;

public class HotelServiceImpl implements HotelService{
    @Override
    public void authorization(String login, String password) throws ServiceException {

    }

    @Override
    public void registration(String login, String password, UserInfo usersInfo) throws ServiceException {

    }

    @Override
    public void removeUser(int userId) throws ServiceException {

    }

    @Override
    public void addRoom(Room room) throws ServiceException {

    }

    @Override
    public List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws ServiceException {
        return null;
    }

    @Override
    public void reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws ServiceException {

    }
}
