package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.dao.AdminDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.dao.CustomerDao;
import by.epam.mypackage.service.HotelService;
import by.epam.mypackage.service.ServiceException;


public class HotelServiceImpl implements HotelService {
    private DAOFactory factory = DAOFactory.getInstance();
    private CustomerDao userDao = factory.getUserDao();
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
    public boolean editUserInfo(String login, String password, UserInfo userInfo) throws ServiceException {
        try {
            return (userDao.editUserInfo(login, password, userInfo));
        } catch (DAOException e) {
            throw new ServiceException("Exception in editUserInfo", e);
        }
    }
}
