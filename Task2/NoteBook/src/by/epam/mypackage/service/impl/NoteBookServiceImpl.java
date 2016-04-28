package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.dao.DaoFile;
import by.epam.mypackage.dao.impl.DaoImpl;
import by.epam.mypackage.service.NoteBookProvider;
import by.epam.mypackage.service.NoteBookService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteBookServiceImpl implements NoteBookService{
    private DaoFile daoFile = new DaoImpl();

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
        for(Note note: NoteBookProvider.getInstance().getNoteList()) {
            if (note.getText().contains(text)) {
                listNote.add(note);
            }
        }
        return listNote;
    }

    @Override
    public List<Note> searchByDate(Date date) {
        List<Note> listNote = new ArrayList<Note>();
        for(Note note: NoteBookProvider.getInstance().getNoteList()) {
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
    public void readFile(String path) throws IOException, ClassNotFoundException {
        NoteBookProvider.setNoteBook(daoFile.readFile(path));
    }

    @Override
    public void writeFile(String path) throws IOException {
        daoFile.writeFile(path);

    }
}