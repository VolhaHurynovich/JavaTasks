package by.epam.mypackage.view;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;

import java.util.List;

public class NoteBookConsoleView {
    public static void print(Note note){
        System.out.println("text: " + note.getText() + ", date: " + note.getDate());
    }

    public static void print(NoteBook noteBook){
        print(noteBook.getNoteList());
    }

    public static void print(List<Note> noteList){
        for (int i = 0;i < noteList.size();i++){
            if (noteList.get(i) != null){
                print(noteList.get(i));
            }
        }
    }
}

