package by.epam.mypackage.dao;

import by.epam.mypackage.bean.NoteBook;

import java.io.IOException;

public interface DaoFile {
     NoteBook readFile(String path);
     void writeFile(String path);
}
