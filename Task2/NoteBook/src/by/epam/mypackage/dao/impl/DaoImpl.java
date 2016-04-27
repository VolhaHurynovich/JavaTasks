package by.epam.mypackage.dao.impl;

import by.epam.mypackage.bean.NoteBook;
import by.epam.mypackage.dao.DaoFile;
import by.epam.mypackage.service.NoteBookProvider;

import java.io.*;

public class DaoImpl implements DaoFile {
    @Override
    public NoteBook readFile(String path) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream oin = new ObjectInputStream(fis)) {
            return (NoteBook) oin.readObject();
        }
    }

    @Override
    public void writeFile(String path) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(NoteBookProvider.getInstance());
        }
    }
}
