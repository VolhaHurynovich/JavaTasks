package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.dao.AdminDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.dao.CustomerDao;
import by.epam.mypackage.service.HotelService;
import by.epam.mypackage.service.ServiceException;

import java.util.Date;
import java.util.List;


public class HotelServiceImpl implements HotelService {
    private DAOFactory factory = DAOFactory.getInstance();
    private CustomerDao customerDao = factory.getCustomerDao();
    private AdminDao adminDao = factory.getAdminDao();

    @Override
    public boolean removeUser(int userId) throws ServiceException {
        try {
            return (adminDao.removeUser(userId));
        } catch (DAOException e) {
            throw new ServiceException("Exception in removeUser", e);
        }
    }

    @Override
    public boolean addRoom(Room room) throws ServiceException {
        try {
            return (adminDao.addRoom(room));
        } catch (DAOException e) {
            throw new ServiceException("Exception in addRoom", e);
        }
    }

    @Override
    public boolean removeRoom(int roomId) throws ServiceException {
        try {
            return (adminDao.removeRoom(roomId));
        } catch (DAOException e) {
            throw new ServiceException("Exception in addRoom", e);
        }
    }

    @Override
    public boolean editUserInfo(int userId, String userFirstName, String userLastName, String userNumPassport,
                                String userAddress, String userEmail, String userPhone) throws ServiceException {
        try {
            return (customerDao.editUserInfo(userId,userFirstName,userLastName, userNumPassport,
                    userAddress, userEmail, userPhone));
        } catch (DAOException e) {
            throw new ServiceException("Exception in editUserInfo", e);
        }
    }

    @Override
    public List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws ServiceException {
        try {
            return (customerDao.findAvailableRooms(dateIn, dateOut));
        } catch (DAOException e) {
            throw new ServiceException("Exception in findAvailableRooms", e);
        }
    }

    @Override
    public boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws ServiceException {
        try {
            return (customerDao.reservationRoom(userId, roomId, dateIn, dateOut));
        } catch (DAOException e) {
            throw new ServiceException("Exception in reservationRoom", e);
        }
    }
}
