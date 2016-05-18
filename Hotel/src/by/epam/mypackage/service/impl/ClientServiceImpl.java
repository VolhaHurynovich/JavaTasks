package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.dao.CommonDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.service.ClientService;
import by.epam.mypackage.service.ServiceException;

public class ClientServiceImpl implements ClientService {
    private DAOFactory factory = DAOFactory.getInstance();
    private CommonDao commonDao = factory.getCommonDao();

    @Override
    public void authorization(String login, String password) throws ServiceException {
        try {
            commonDao.authorization(login, password);
        } catch (DAOException e) {
            throw new ServiceException("Exception in authorization",e);
        }
    }

    @Override
    public void registration(String login, String password, UserInfo userInfo) throws ServiceException {
        try {
            commonDao.registration(login, password, userInfo);
        } catch (DAOException e) {
            throw new ServiceException("Exception in registration",e);
        }
    }
}
