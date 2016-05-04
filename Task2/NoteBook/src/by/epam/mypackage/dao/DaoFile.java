package by.epam.mypackage.dao;

import MyException.DaoException;
import by.epam.mypackage.bean.NoteBook;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DaoFile {
     NoteBook readFile(String path) throws  DaoException;
     void writeFile(String path) throws  DaoException;
}
