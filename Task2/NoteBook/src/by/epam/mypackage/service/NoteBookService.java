package by.epam.mypackage.service;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;

import java.util.Date;
import java.util.List;

public interface NoteBookService {
    boolean addNote(String text, Date date);
    void createNoteBook();
    List<Note> searchByText(String text);
    List<Note> searchByDate(Date date);
    List<Note> getNoteBook();
    void readFile(String path);
    void writeFile(String path);
}
