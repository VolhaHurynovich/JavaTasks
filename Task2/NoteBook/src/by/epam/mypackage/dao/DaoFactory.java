package by.epam.mypackage.dao;

import by.epam.mypackage.dao.impl.DaoImpl;

public class DaoFactory {
    private static final DaoFactory factory = new DaoFactory();
    private final DaoImpl daoImpl = new DaoImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return factory;
    }

    public DaoImpl getDaoImpl() {
        return daoImpl;
    }
}
