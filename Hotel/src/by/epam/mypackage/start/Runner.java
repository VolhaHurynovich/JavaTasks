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
     //   User user = factory.getCommonDao().authorization("c24421", "222244");
     //   int userId = factory.getCommonDao().registration("c24421", "222244");
      //  factory.getCustomerDao().editUserInfo(userId, "A2244", "BBB4", "MP11111144", "Minsk", "ggg@uu.uu", "+375294444444444");
        boolean forHelp;
      //  forHelp= factory.getAdminDao().editStatusNameToAdmin(userId);
        forHelp = factory.getAdminDao().removeUser(1);

        connectionPool.dispose();


    }


}
