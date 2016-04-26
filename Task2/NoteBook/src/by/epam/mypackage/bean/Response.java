package by.epam.mypackage.bean;

import java.util.List;

public class Response {
    private List<Note> listNote;
    private Note note;
    private String errorMessage;
    private String message;


    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Note> getListBook() {
        return listNote;
    }
    public void setListBook(List<Note> listNote) {
        this.listNote = listNote;
    }
    public Note getNote() {
        return note;
    }
    public void setNote(Note note) {
        this.note = note;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}
