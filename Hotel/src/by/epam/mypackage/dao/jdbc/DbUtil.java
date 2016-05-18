package by.epam.mypackage.dao.jdbc;

import exception.DAOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

    public static void close(Connection connection) throws DAOException {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw  new DAOException("SQLException in close",e);
            }
        }
    }

    public static void close(Statement statement) throws DAOException {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw  new DAOException("SQLException in close",e);
            }
        }
    }

    public static void close(ResultSet resultSet) throws DAOException {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw  new DAOException("SQLException in close",e);
            }
        }
    }
}