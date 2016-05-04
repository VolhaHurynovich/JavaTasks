package by.epam.mypackage.service.impl;

import MyException.DaoException;
import MyException.ServiceException;
import by.epam.mypackage.bean.Note;
import by.epam.mypackage.dao.DaoFactory;
import by.epam.mypackage.dao.DaoFile;
import by.epam.mypackage.service.NoteBookProvider;
import by.epam.mypackage.service.NoteBookService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteBookServiceImpl implements NoteBookService {
    private DaoFile daoFile = DaoFactory.getInstance().getDaoImpl();

    @Override
    public void addNote(String text, Date date) {
        NoteBookProvider.getInstance().addNote(new Note(text, date));
    }

    @Override
    public void createNoteBook() {
        NoteBookProvider.createNoteBook();
    }

    @Override
    public List<Note> searchByText(String text) {
        List<Note> listNote = new ArrayList<>();
        for (Note note : NoteBookProvider.getInstance().getNoteList()) {
            if (note.getText().contains(text)) {
                listNote.add(note);
            }
        }
        return listNote;
    }

    @Override
    public List<Note> searchByDate(Date date) {
        List<Note> listNote = new ArrayList<Note>();
        for (Note note : NoteBookProvider.getInstance().getNoteList()) {
            if (note.getDate().equals(date)) {
                listNote.add(note);
            }
        }
        return listNote;
    }

    @Override
    public List<Note> getNoteBook() {
        return NoteBookProvider.getInstance().getNoteList();
    }

    @Override
    public void readFile(String path) throws ServiceException {
        try {
            NoteBookProvider.setNoteBook(daoFile.readFile(path));
        } catch (DaoException e) {
            throw new ServiceException("File did not read", e);
        }

    }

    @Override
    public void writeFile(String path) throws ServiceException {
        try {
            daoFile.writeFile(path);
        } catch (DaoException e) {
            throw new ServiceException("File did not write", e);
        }

    }
}