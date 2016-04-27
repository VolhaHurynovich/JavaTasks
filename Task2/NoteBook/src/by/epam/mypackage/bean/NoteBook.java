package by.epam.mypackage.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NoteBook implements Serializable{
    private List<Note> noteList;

    public NoteBook() {
        this.noteList = new ArrayList<Note>();
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public Note getNote(int i) {
        return noteList.get(i);
    }

    public void setNoteList(ArrayList<Note> noteList) {
        this.noteList = noteList;
    }

    public void addNote(Note note)
    {
        this.noteList.add(note);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        NoteBook noteBook = (NoteBook) obj;
        if (noteList != null ? !noteList.equals(noteBook.noteList) : noteBook.noteList != null) return false;
        return true;

    }

    @Override
    public int hashCode() {
        return noteList != null ? noteList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return getClass().getName()+ "@" + "noteList: '" + noteList ;
    }
}
