package by.epam.mypackage.dao;

import by.epam.mypackage.dao.impl.SQLAdminDao;
import by.epam.mypackage.dao.impl.SQLCommonDao;
import by.epam.mypackage.dao.impl.SQLCustomerDao;

public class DAOFactory {
    private static final DAOFactory factory = new DAOFactory();

    private final CommonDao commonDao = new SQLCommonDao();
    private final CustomerDao customerDao = new SQLCustomerDao();
    private final AdminDao adminDao = new SQLAdminDao();

    private DAOFactory() {
    }


    public static DAOFactory getInstance() {
        return factory;
    }

    public CommonDao getCommonDao() {
        return commonDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public AdminDao getAdminDao() {
        return adminDao;
    }
}