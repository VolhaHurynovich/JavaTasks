package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.User;

import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.CommonDao;
import by.epam.mypackage.dao.DAOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static by.epam.mypackage.bean.User.USER_STATUS_NAME_CUSTOMER;


public class SQLCommonDao implements CommonDao {

    private ConnectionPool connectionPool = ConnectionPool.getInstance();

    @Override
    public User authorization(String userName, String userPassword) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        ResultSet res = null;
        User user = new User();
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "SELECT * FROM HOTEL_NEW.Users WHERE userName =" + "'" + userName + "'" + " AND userPassword =" + "'" + userPassword + "'";
            res = statement.executeQuery(query);
            if (res.next()) {
                user.setUserId(res.getInt(1));
                user.setUserName(userName);
                user.setUserPassword(userPassword);
                user.setUserStatusName(res.getString(4));
            } else {
                user = null;
            }
        } catch (SQLException e) {
            throw new DAOException("SQLException in authorization", e);
        } catch (ConnectionPoolException e) {
            throw new DAOException("ConnectionPoolException in authorization", e);
        } finally {
            try {
                connectionPool.closeConnection(connection, statement, res);
            } catch (ConnectionPoolException e) {
                throw new DAOException("ConnectionPoolException in authorization", e);
            }
        }
        return user;
    }

    @Override
    public int registration(String userName, String userPassword) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        ResultSet res = null;
        int userId = 0;
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO HOTEL_NEW.Users (userName,userPassword,userStatusName) VALUES (" +
                    "'" + userName + "','" + userPassword + "','" + USER_STATUS_NAME_CUSTOMER + "')";
            statement.executeUpdate(query);
            query = "SELECT * FROM HOTEL_NEW.Users WHERE userName =" + "'" + userName + "'" + " AND userPassword =" + "'" + userPassword + "'";
            res = statement.executeQuery(query);
            if (res.next()) {
                userId = res.getInt(1);
            }
        } catch (SQLException e) {
            throw new DAOException("SQLException in registration", e);
        } catch (ConnectionPoolException e) {
            throw new DAOException("ConnectionPoolException in registration", e);
        } finally {
            try {
                connectionPool.closeConnection(connection, statement, res);
            } catch (ConnectionPoolException e) {
                throw new DAOException("ConnectionPoolException in registration", e);
            }
        }
        return userId;
    }


}