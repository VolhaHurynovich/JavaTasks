package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.dao.AdminDao;
import by.epam.mypackage.dao.DAOException;

public class SQLAdminDao implements AdminDao {

    @Override
    public void removeUser(int userId) throws DAOException {
        // TODO Auto-generated method stub
        throw  new DAOException("Exception");
    }

    @Override
    public void addRoom(Room room) throws DAOException {
        // TODO Auto-generated method stub
        throw  new DAOException("Exception");
    }

}