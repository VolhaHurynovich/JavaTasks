package by.epam.mypackage.start;

import by.epam.mypackage.dao.DatabaseDAO;
import exception.DAOException;


public class Runner {
    public static void main(String[] args) {
        createDB();
    }

    private static void createDB() {
        try {
            String dbName = "hotel";
            DatabaseDAO dbDao = new DatabaseDAO();
            dbDao.createDatabase(dbName);
            System.out.println("Database Successfully Created");
        } catch (DAOException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
