package by.epam.mypackage.bean;

import java.util.Date;

public class Note {
    private String text;
    private Date date;

    public Note() {
        this.text = "";
        this.date = new Date();
    }

    public Note(String text) {
        this.text = text;
        this.date = new Date();
    }

    public Note(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (text != null ? !text.equals(note.text) : note.text != null) return false;
        if (date != null ? !date.equals(note.date) : note.date != null) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
