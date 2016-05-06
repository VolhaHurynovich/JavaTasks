package by.epam.mypackage.dao;

import by.epam.mypackage.bean.NoteBook;

public interface DaoNotebook {
     NoteBook readFile(String path) throws  DaoException;
     void writeFile(String path) throws  DaoException;
}
