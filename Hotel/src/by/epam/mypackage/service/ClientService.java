package by.epam.mypackage.service;

import by.epam.mypackage.bean.UserInfo;

public interface ClientService {
    void authorization(String login, String password) throws ServiceException;
    void registration(String login, String password, UserInfo usersInfo) throws ServiceException;
}
