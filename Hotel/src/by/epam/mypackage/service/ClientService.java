package by.epam.mypackage.service;

import by.epam.mypackage.bean.User;

public interface ClientService {
    User authorization(String login, String password) throws ServiceException;

    int registration(String userName, String userPassword) throws ServiceException;



}
