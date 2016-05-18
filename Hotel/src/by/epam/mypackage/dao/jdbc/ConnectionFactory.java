package by.epam.mypackage.dao.jdbc;

import exception.DAOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static ConnectionFactory instance;
    public static final String URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    //private constructor
    private ConnectionFactory() throws DAOException {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            throw  new DAOException("ClassNotFoundException in ConnectionFactory.",e);
        }
    }

    private Connection createConnection() throws DAOException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw  new DAOException("SQLException: Unable to Connect to Database.",e);
        }
        return connection;
    }

    public static Connection getConnection() throws DAOException {
        instance = new ConnectionFactory();
        return instance.createConnection();
    }
}