package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.UserDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SQLUserDao implements UserDao {

    @Override
    public List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws DAOException {
        // TODO Auto-generated method stub
        return new ArrayList<Room>();
    }

    @Override
    public void reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws DAOException {
        // TODO Auto-generated method stub
        throw  new DAOException("Exception");
    }

}
