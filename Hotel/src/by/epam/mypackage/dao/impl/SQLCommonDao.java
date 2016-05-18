package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.dao.CommonDao;
import by.epam.mypackage.dao.DAOException;


public class SQLCommonDao implements CommonDao {

    @Override
    public void authorization(String login, String password) throws DAOException {
        // TODO Auto-generated method stub

            throw  new DAOException("Exception");

    }

    @Override
    public void registration(String login, String password, UserInfo usersInfo) throws DAOException {
        // TODO Auto-generated method stub
        throw  new DAOException("Exception");
    }

}