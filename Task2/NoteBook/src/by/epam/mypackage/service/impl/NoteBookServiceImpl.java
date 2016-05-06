package by.epam.mypackage.service.impl;

import by.epam.mypackage.dao.DaoException;
import by.epam.mypackage.service.ServiceException;
import by.epam.mypackage.bean.Note;
import by.epam.mypackage.dao.DaoFactory;
import by.epam.mypackage.dao.DaoNotebook;
import by.epam.mypackage.service.NoteBookProvider;
import by.epam.mypackage.service.NoteBookService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteBookServiceImpl implements NoteBookService {
    private DaoNotebook daoFile = DaoFactory.getInstance().getDaoImpl();

    @Override
    public void addNote(String text, Date date) throws ServiceException{
        NoteBookProvider.getInstance().addNote(new Note(text, date));
    }

    @Override
    public void createNoteBook() throws ServiceException{
        NoteBookProvider.createNoteBook();
    }

    @Override
    public List<Note> searchByText(String text) throws ServiceException{
        List<Note> listNote = new ArrayList<>();
        for (Note note : NoteBookProvider.getInstance().getNoteList()) {
            if (note.getText().contains(text)) {
                listNote.add(note);
            }
        }
        return listNote;
    }

    @Override
    public List<Note> searchByDate(Date date) throws ServiceException{
        List<Note> listNote = new ArrayList<Note>();
        for (Note note : NoteBookProvider.getInstance().getNoteList()) {
            if (note.getDate().equals(date)) {
                listNote.add(note);
            }
        }
        return listNote;
    }

    @Override
    public List<Note> getNoteBook()throws ServiceException  {
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