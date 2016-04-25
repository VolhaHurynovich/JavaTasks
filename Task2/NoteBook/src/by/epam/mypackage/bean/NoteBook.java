package by.epam.mypackage.bean;


import java.util.ArrayList;

public class NoteBook {
    private ArrayList<Note> noteList;

    public NoteBook() {
        this.noteList = null;
    }
    public NoteBook(ArrayList<Note> noteList) {
        this.noteList = noteList;
    }

    public ArrayList<Note> getNoteList() {
        return noteList;
    }

    public Note getNote(int i) {
        return noteList.get(i);
    }

    public void setNoteList(ArrayList<Note> noteList) {
        this.noteList = noteList;
    }

    public void addNote(Note note) {
        this.noteList.add(note);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteBook noteBook = (NoteBook) o;

        return noteList != null ? noteList.equals(noteBook.noteList) : noteBook.noteList == null;

    }

    @Override
    public int hashCode() {
        return noteList != null ? noteList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "noteList=" + noteList +
                '}';
    }
}
