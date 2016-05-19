package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.User;
import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.dao.CommonDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.service.ClientService;
import by.epam.mypackage.service.ServiceException;

import java.util.Date;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    private DAOFactory factory = DAOFactory.getInstance();
    private CommonDao commonDao = factory.getCommonDao();

    @Override
    public User authorization(String login, String password) throws ServiceException {
        try {
            return (commonDao.authorization(login, password));
        } catch (DAOException e) {
            throw new ServiceException("Exception in authorization", e);
        }
    }

    @Override
    public int registration(String userName, String userPassword,  String userFirstName,
                            String userLastName, String userNumPassport, String userAddress, String userPhone) throws ServiceException {
        try {
           return (commonDao.registration(userName, userPassword, userFirstName,
                    userLastName, userNumPassport, userAddress, userPhone));
        } catch (DAOException e) {
            throw new ServiceException("Exception in registration", e);
        }
    }

    @Override
    public List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws ServiceException {
        try {
            return (commonDao.findAvailableRooms(dateIn, dateOut));
        } catch (DAOException e) {
            throw new ServiceException("Exception in findAvailableRooms", e);
        }
    }

    @Override
    public boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws ServiceException {
        try {
            return (commonDao.reservationRoom(userId, roomId, dateIn, dateOut));
        } catch (DAOException e) {
            throw new ServiceException("Exception in reservationRoom", e);
        }
    }
}
