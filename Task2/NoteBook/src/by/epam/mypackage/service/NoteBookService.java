package by.epam.mypackage.service;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface NoteBookService {
    void addNote(String text, Date date);
    void createNoteBook();
    List<Note> getNoteBook();
    void readFile(String path) throws IOException, ClassNotFoundException;
    List<Note> searchByText(String text);
    List<Note> searchByDate(Date date);
    void writeFile(String path) throws IOException;
}