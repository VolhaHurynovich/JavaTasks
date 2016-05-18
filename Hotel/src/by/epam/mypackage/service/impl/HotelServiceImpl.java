package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.dao.AdminDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.dao.UserDao;
import by.epam.mypackage.service.HotelService;
import by.epam.mypackage.service.ServiceException;

import java.util.Date;
import java.util.List;

public class HotelServiceImpl implements HotelService{
    private DAOFactory factory = DAOFactory.getInstance();
    private UserDao userDao = factory.getUserDao();
    AdminDao adminDao = factory.getAdminDao();

    @Override
    public void removeUser(int userId) throws ServiceException {
        try {
            adminDao.removeUser(userId);
        } catch (DAOException e) {
            throw new ServiceException("Exception in removeUser",e);
        }
    }

    @Override
    public void addRoom(Room room) throws ServiceException {
        try {
            adminDao.addRoom(room);
        } catch (DAOException e) {
            throw new ServiceException("Exception in addRoom",e);
        }
    }

    @Override
    public List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws ServiceException {
        try {
            return (userDao.findAvailableRooms(dateIn,dateOut));
        } catch (DAOException e) {
            throw new ServiceException("Exception in findAvailableRooms",e);
        }
    }

    @Override
    public void reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws ServiceException {
        try {
            userDao.reservationRoom(userId,roomId,dateIn,dateOut);
        } catch (DAOException e) {
            throw new ServiceException("Exception in reservationRoom",e);
        }
    }
}
