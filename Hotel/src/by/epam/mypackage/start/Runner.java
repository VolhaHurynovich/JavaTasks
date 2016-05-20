package by.epam.mypackage.start;



import by.epam.mypackage.bean.Room;
import by.epam.mypackage.connectionpool.ConnectionPool;
import by.epam.mypackage.connectionpool.ConnectionPoolException;
import by.epam.mypackage.dao.DAOException;
import by.epam.mypackage.dao.DAOFactory;

import java.util.Date;
import java.util.List;


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
      //  forHelp = factory.getAdminDao().removeUser(482);

        Room room = new Room("572","Family room",2,2,200.00,"Available");
     //   forHelp= factory.getAdminDao().addRoom(room);

     //   forHelp= factory.getAdminDao().removeRoom(806);

      //  List<Room> rooms = factory.getCustomerDao().searchAvailableRooms(new Date("2016/06/01"),new Date("2016/06/01"));
        forHelp= factory.getCustomerDao().reservationRoom(3,809,new Date("2016/09/01"),new Date("2016/09/01"));
        connectionPool.dispose();


    }


}
