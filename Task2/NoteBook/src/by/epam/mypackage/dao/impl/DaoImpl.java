package by.epam.mypackage.dao.impl;

import MyException.DaoException;
import by.epam.mypackage.bean.NoteBook;
import by.epam.mypackage.dao.DaoFile;
import by.epam.mypackage.service.NoteBookProvider;

import java.io.*;

public class DaoImpl implements DaoFile {
    @Override
    public NoteBook readFile(String path) throws DaoException {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream oin = new ObjectInputStream(fis)) {
            return (NoteBook) oin.readObject();
        } catch (ClassNotFoundException e){
            throw new DaoException("ClassNotFoundException",e);
        } catch (IOException e){
            throw  new DaoException("IOException in readFile",e);
        }
    }

    @Override
    public void writeFile(String path) throws DaoException {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(NoteBookProvider.getInstance());
        } catch (IOException e){
            throw  new DaoException("IOException in writeFile",e);
        }
    }
}
