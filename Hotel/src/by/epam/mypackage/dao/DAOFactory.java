package by.epam.mypackage.dao;

import by.epam.mypackage.dao.impl.SQLAdminDao;
import by.epam.mypackage.dao.impl.SQLCommonDao;
import by.epam.mypackage.dao.impl.SQLUserDao;

public class DAOFactory {
    private static final DAOFactory factory = new DAOFactory();

    private final CommonDao commonDao = new SQLCommonDao();
    private final UserDao userDao = new SQLUserDao();
    private final AdminDao adminDao = new SQLAdminDao();

    private DAOFactory() {
    }


    public static DAOFactory getInstance() {
        return factory;
    }


    public CommonDao getCommonDao() {
        return commonDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public AdminDao getAdminDao() {
        return adminDao;
    }
}