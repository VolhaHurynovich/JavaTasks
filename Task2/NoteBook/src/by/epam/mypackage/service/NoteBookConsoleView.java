package by.epam.mypackage.service;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;

public class NoteBookConsoleView {
    public void print(Note note){
        System.out.println(note.toString());
    }

    public void print(NoteBook noteBook){
        System.out.println(noteBook.toString());
    }

    public void print(NoteBook noteBook, int count){
        for (int i = 0;i < count;i++){
            if (noteBook.getNote(i) != null){
                System.out.println(noteBook.getNote(i).toString());
            }
        }
    }
}
