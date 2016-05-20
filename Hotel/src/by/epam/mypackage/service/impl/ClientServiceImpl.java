package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.User;
import by.epam.mypackage.dao.CommonDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.service.ClientService;
import by.epam.mypackage.service.ServiceException;

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
    public int registration(String userName, String userPassword) throws ServiceException {
        try {
           return (commonDao.registration(userName, userPassword));
        } catch (DAOException e) {
            throw new ServiceException("Exception in registration", e);
        }
    }


}
