package by.epam.mypackage.service;

public class NoteBookProvider {
    private static NoteBookProvider instance = null;

    protected NoteBookProvider() {
    }

    public static NoteBookProvider getInstance() {
        if(instance == null) {
            instance = new NoteBookProvider();
        }
        return instance;
    }
}
