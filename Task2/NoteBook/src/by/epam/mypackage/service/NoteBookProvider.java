package by.epam.mypackage.service;

import by.epam.mypackage.bean.NoteBook;

public class NoteBookProvider {
    private static NoteBook instance = null;

    private NoteBookProvider() {
    }

    public static NoteBook getInstance() {
        if (instance == null) {
            instance = new NoteBook();
        }
        return instance;
    }

    public static NoteBook createNoteBook() {
        instance = new NoteBook();
        return instance;
    }

    public static void setNoteBook(NoteBook noteBook) {
        instance = noteBook;
    }
}

