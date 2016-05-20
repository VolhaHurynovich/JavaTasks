package by.epam.mypackage.service;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.User;
import by.epam.mypackage.bean.UserInfo;

import java.util.Date;
import java.util.List;

public interface ClientService {
    User authorization(String login, String password) throws ServiceException;

    int registration(String userName, String userPassword) throws ServiceException;



}
