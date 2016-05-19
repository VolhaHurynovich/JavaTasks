package by.epam.mypackage.dao;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;

public interface CustomerDao {
    boolean editUserInfo(String login, String password, UserInfo userInfo) throws DAOException;
}
