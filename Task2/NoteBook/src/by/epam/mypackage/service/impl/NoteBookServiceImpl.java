package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;
import by.epam.mypackage.service.NoteBookService;

import java.util.Date;
import java.util.List;

public class NoteBookServiceImpl implements NoteBookService{
    @Override
    public boolean addNote(String text, Date date) {
        // TODO: 4/26/2016
        return false;
    }

    @Override
    public boolean createNoteBook(NoteBook notebook) {
        // TODO: 4/26/2016
        return false;
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
    public void readFile(String path) {
        // TODO: 4/26/2016

    }

    @Override
    public void writeFile(String path) {
        // TODO: 4/26/2016

    }
}
