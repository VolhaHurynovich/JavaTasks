package by.epam.mypackage.dao.impl;


import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.CustomerDao;


public class SQLCustomerDao implements CustomerDao {


    @Override
    public boolean editUserInfo(String login, String password, UserInfo userInfo) throws DAOException {


        return false;
    }
}
