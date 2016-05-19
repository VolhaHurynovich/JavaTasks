package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.dao.AdminDao;
import by.epam.mypackage.dao.DAOException;

public class SQLAdminDao implements AdminDao {
    public static final String USER_STATUS_NAME_ADMIN = "admin";

    @Override
    public boolean removeUser(int userId) throws DAOException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addRoom(Room room) throws DAOException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeRoom(int roomId) throws DAOException {


        return false;
    }

}