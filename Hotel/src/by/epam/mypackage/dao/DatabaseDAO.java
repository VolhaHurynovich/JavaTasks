package by.epam.mypackage.dao;

import by.epam.mypackage.dao.jdbc.ConnectionFactory;
import by.epam.mypackage.dao.jdbc.DbUtil;
import exception.DAOException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseDAO {

    private Connection connection;
    private Statement statement;

    public DatabaseDAO() { }

    public void createDatabase(String dbName) throws DAOException {
        String query = "CREATE DATABASE IF NOT EXISTS " + dbName;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw  new DAOException("SQLException",e);
        } finally {
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
    }
}
