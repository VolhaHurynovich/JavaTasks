package by.epam.mypackage.dao;

import by.epam.mypackage.dao.impl.DaoFileImpl;

public class DaoFactory {
    private static final DaoFactory factory = new DaoFactory();
    private final DaoFileImpl daoImpl = new DaoFileImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return factory;
    }

    public DaoFileImpl getDaoImpl() {
        return daoImpl;
    }
}
