package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.CustomerDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SQLCustomerDao implements CustomerDao {

    private ConnectionPool connectionPool = ConnectionPool.getInstance();

    @Override
    public boolean editUserInfo(int userId, String userFirstName, String userLastName, String userNumPassport,
                                String userAddress, String userEmail, String userPhone) throws DAOException {
        Connection connection;
        try {
            connection = connectionPool.takeConnection();
            Statement statement = connection.createStatement();
            String query = "INSERT INTO HOTEL_NEW.UsersInfo (userId, userFirstName, userLastName," +
                    " userNumPassport, userAdress, userEmail, userPhone) VALUES ("
                    + userId + ",'" + userFirstName + "','" + userLastName + "','" + userNumPassport +
                    "','" + userAddress + "','" + userEmail + "','" + userPhone + "')";
            statement.executeUpdate(query);
            connectionPool.closeConnection(connection, statement);
        } catch (SQLException e) {
            return false;
        } catch (ConnectionPoolException e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Room> findAvailableRooms(Date dateIn, Date dateOut) throws DAOException {
        // TODO Auto-generated method stub
        return new ArrayList<Room>();
    }

    @Override
    public boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws DAOException {
        // TODO Auto-generated method stub
        return false;
    }
}
