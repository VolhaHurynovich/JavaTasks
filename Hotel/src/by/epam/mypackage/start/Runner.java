package by.epam.mypackage.start;


import by.epam.mypackage.bean.User;
import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;
import by.epam.mypackage.dao.impl.SQLCommonDao;

import java.sql.Connection;
import java.sql.Statement;


public class Runner {

    public static void main(String[] args) throws ConnectionPoolException, DAOException {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        connectionPool.initPoolData();

        DAOFactory factory = DAOFactory.getInstance();
        User user = factory.getCommonDao().authorization("customer20", "22220");
        int userId = factory.getCommonDao().registration("customer250", "55550", "AAA", "BBBB", "MP111111", "Minsk", "+375294444444444");
        connectionPool.dispose();


    }


}
