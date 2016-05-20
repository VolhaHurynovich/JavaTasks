package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.AdminDao;
import by.epam.mypackage.dao.DAOException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import static by.epam.mypackage.bean.User.USER_STATUS_NAME_ADMIN;


public class SQLAdminDao implements AdminDao {


    private ConnectionPool connectionPool = ConnectionPool.getInstance();

    @Override
    public boolean editStatusNameToAdmin(int userId) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "UPDATE HOTEL_NEW.Users SET userStatusName= '" + USER_STATUS_NAME_ADMIN + "' where userId = " + userId + ";";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            return false;
        } catch (ConnectionPoolException e) {
            return false;
        } finally {
            try {
                connectionPool.closeConnection(connection, statement);
            } catch (ConnectionPoolException e) {
                throw new DAOException("ConnectionPoolException in editStatusNameToAdmin", e);
            }
        }
        return true;
    }

    @Override
    public boolean removeUser(int userId) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        Savepoint svpt = null;
        try {
            connection = connectionPool.takeConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            svpt = connection.setSavepoint();
            String query = "DELETE FROM HOTEL_NEW.UsersInfo where userId =" + userId + ";";
            statement.executeUpdate(query);
            query = "DELETE FROM HOTEL_NEW.Users where userId =" + userId + ";";
            statement.executeUpdate(query);
            connection.commit();
        } catch (SQLException | ConnectionPoolException e) {
            try {
                connection.rollback(svpt);
            } catch (SQLException e1) {
                throw new DAOException("SQLException in removeUser", e1);
            }
            return false;
        } finally {
            try {
                connectionPool.closeConnection(connection, statement);
                connection.setAutoCommit(true);
            } catch (SQLException | ConnectionPoolException e) {
                throw new DAOException("Exception in removeUser", e);
            }
        }
        return true;
    }

    @Override
    public boolean addRoom(Room room) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO HOTEL_NEW.Rooms(roomNumber,roomType,roomNumOfAdult,roomNumOfChild,roomPriceDay,roomStatus) VALUES ('"
                    + room.getRoomNumber() + "','" + room.getRoomType() + "'," + room.getRoomNumOfAdult() +
                    "," + room.getRoomNumOfChild() + "," + room.getRoomPriceDay() + ",'" + room.getRoomStatus() + "');";
            statement.executeUpdate(query);
        } catch (SQLException | ConnectionPoolException e) {
            return false;
        } finally {
            try {
                connectionPool.closeConnection(connection, statement);
            } catch (ConnectionPoolException e) {
                throw new DAOException("ConnectionPoolException in addRoom", e);
            }
        }
        return true;
    }

    @Override
    public boolean removeRoom(int roomId) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "DELETE FROM HOTEL_NEW.rooms where roomId =" + roomId + ";";
            statement.executeUpdate(query);
        } catch (SQLException | ConnectionPoolException e) {
            return false;
        } finally {
            try {
                connectionPool.closeConnection(connection, statement);
            } catch (ConnectionPoolException e) {
                throw new DAOException("ConnectionPoolException in addRoom", e);
            }
        }
        return true;
    }

}