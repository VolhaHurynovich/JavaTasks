package by.epam.mypackage.bean;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;


public class NoteTest {
    @Test
    public void testAddNote() {
        NoteBook noteBook1 = new NoteBook();
        noteBook1.addNote(new Note("note 1",new Date("2015/02/03")));
        NoteBook noteBook2 = new NoteBook();
        noteBook2.addNote(new Note("note 1",new Date("2015/02/03")));
        Assert.assertTrue(noteBook1.equals(noteBook2));
    }

    @Test
    public void testHashCode() {
        Note note1 = new Note("note 1",new Date("2015/02/03"));
        Note note2 = new Note("note 1",new Date("2015/02/03"));
        Assert.assertTrue(note1.hashCode() == note2.hashCode());
    }

}
