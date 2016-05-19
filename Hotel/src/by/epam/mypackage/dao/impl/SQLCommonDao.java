package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.bean.User;
import by.epam.mypackage.bean.UserInfo;
import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.CommonDao;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.start.Runner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SQLCommonDao implements CommonDao {

    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    public static final String USER_STATUS_NAME_CUSTOMER = "customer";

    @Override
    public User authorization(String userName, String userPassword) throws DAOException {
        Connection connection;
        User user = new User();
        try {
            connection = connectionPool.takeConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM HOTEL_NEW.Users WHERE userName =" + "'" + userName + "'" + " AND userPassword =" + "'" + userPassword + "'";
            ResultSet res = statement.executeQuery(query);
            if (res.next()) {
                user.setUserId(res.getInt(1));
                user.setUserName(userName);
                user.setUserPassword(userPassword);
                user.setUserStatusName(res.getString(4));
            }
            connectionPool.closeConnection(connection, statement, res);
        } catch (SQLException e) {
            throw new DAOException("SQLException in authorization", e);
        } catch (ConnectionPoolException e) {
            throw new DAOException("ConnectionPoolException in authorization", e);
        }
        return user;
    }

    @Override
    public int registration(String userName, String userPassword,  String userFirstName,
                            String userLastName, String userNumPassport, String userAddress, String userPhone) throws DAOException {
        Connection connection;
        int userId = 0;
        try {
            connection = connectionPool.takeConnection();
            Statement statement = connection.createStatement();
            String query = "INSERT INTO HOTEL_NEW.Users (userName,userPassword,userStatusName) VALUES (" +
                    "'" + userName + "','" + userPassword +"','" + USER_STATUS_NAME_CUSTOMER +"')";
            statement.executeUpdate(query);
            query = "SELECT * FROM HOTEL_NEW.Users WHERE userName =" + "'" + userName + "'" + " AND userPassword =" + "'" + userPassword + "'";
            ResultSet res = statement.executeQuery(query);
            if (res.next()) {
                userId = res.getInt(1);
            }
            query = "INSERT INTO HOTEL_NEW.UsersInfo (userId, userFirstName, userLastName, userNumPassport, userAdress, userPhone) VALUES ("
                    + userId + ",'" + userFirstName +"','" + userLastName +"','" + userNumPassport + "','" + userAddress + "','" + userPhone+ "')";

            statement.executeUpdate(query);
            connectionPool.closeConnection(connection, statement, res);
        } catch (SQLException e) {
            throw new DAOException("SQLException in registration", e);
        } catch (ConnectionPoolException e) {
            throw new DAOException("ConnectionPoolException in registration", e);
        }
        return userId;
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