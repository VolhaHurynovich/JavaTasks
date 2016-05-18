package by.epam.mypackage.dao;

import by.epam.mypackage.bean.UserInfo;

public interface CommonDao {
    void authorization(String login, String password);
    void registration(String login, String password, UserInfo usersInfo);
}
