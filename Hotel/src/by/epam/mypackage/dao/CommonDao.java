package by.epam.mypackage.dao;

import by.epam.mypackage.bean.User;

public interface CommonDao {
    User authorization(String login, String password) throws DAOException;

    int registration(String userName, String userPassword) throws DAOException;

}
