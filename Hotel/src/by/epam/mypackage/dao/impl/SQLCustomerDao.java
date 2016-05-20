package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.Room;
import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.CustomerDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static by.epam.mypackage.bean.Reservation.ROOM_STATUS_RES_UNPAID;


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

    public List<Room> searchAvailableRooms(Date dateIn, Date dateOut) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        ResultSet res = null;

        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "SELECT * FROM HOTEL_NEW.rooms WHERE  roomId NOT IN (SELECT roomId FROM HOTEL_NEW.reservation WHERE dateIn <= '" + dateIn + "' AND dateOut >= '" + dateOut + "');";
            res = statement.executeQuery(query);
            List<Room> rooms = new ArrayList<Room>();
            while (res.next()) {
                Room room = new Room();
                room.setRoomNumber(res.getString(2));
                room.setRoomType(res.getString(3));
                room.setRoomNumOfAdult(res.getInt(4));
                room.setRoomNumOfChild(res.getInt(5));
                room.setRoomPriceDay(res.getDouble(6));
                room.setRoomStatus(res.getString(7));

                rooms.add(room);
            }
            return (rooms);
        } catch (ConnectionPoolException | SQLException e) {
            throw new DAOException("Exception in searchAvailableRooms", e);
        } finally {
            try {
                connectionPool.closeConnection(connection, statement, res);
            } catch (ConnectionPoolException e) {
                throw new DAOException("ConnectionPoolException in searchAvailableRooms", e);
            }
        }
    }

    @Override
    public boolean reservationRoom(int userId, int roomId, Date dateIn, Date dateOut) throws DAOException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO HOTEL_NEW.reservation (userId, roomId, dateIn, dateOut,resStatus) VALUES (" + userId + "," + roomId + ",'"+ dateIn+"', '"+ dateOut + "','" + ROOM_STATUS_RES_UNPAID  +"');";
            statement.executeUpdate(query);
        } catch (ConnectionPoolException | SQLException e) {
            return false;
        } finally {
            try {
                connectionPool.closeConnection(connection, statement);
            } catch (ConnectionPoolException e) {
                throw new DAOException("Exception in reservationRoom", e);
            }
        }
        return true;
    }
}
