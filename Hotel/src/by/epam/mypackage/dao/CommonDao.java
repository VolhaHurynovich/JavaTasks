package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.User;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;

public interface CommonDao {
    User authorization(String login, String password) throws DAOException;
    int registration(String userName, String userPassword) throws DAOException;

}
