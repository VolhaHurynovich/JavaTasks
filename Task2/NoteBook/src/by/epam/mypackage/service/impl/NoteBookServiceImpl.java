package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;
import by.epam.mypackage.dao.DaoFile;
import by.epam.mypackage.dao.impl.DaoImpl;
import by.epam.mypackage.service.NoteBookProvider;
import by.epam.mypackage.service.NoteBookService;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class NoteBookServiceImpl implements NoteBookService{
    private DaoFile daoFile = new DaoImpl();

    @Override
    public boolean addNote(String text, Date date) {
        // TODO: 4/26/2016
        return false;
    }

    @Override
    public void createNoteBook() {
        NoteBookProvider.getNoteBook();
    }

    @Override
    public List<Note> searchByText(String text) {
        // TODO: 4/26/2016
        return null;
    }

    @Override
    public List<Note> searchByDate(Date date) {
        // TODO: 4/26/2016
        return null;
    }

    @Override
    public List<Note> getNoteBook() {
        // TODO: 4/26/2016
        return null;
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        NoteBookProvider.setNoteBook(daoFile.readFile(path));
    }

    @Override
    public void writeFile(String path) {
        // TODO: 4/26/2016

    }
}
