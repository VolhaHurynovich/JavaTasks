package by.epam.mypackage.service.impl;

import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.NoteBook;
import by.epam.mypackage.service.NoteBookProvider;
import by.epam.mypackage.service.ServiceException;
import org.testng.annotations.*;

import java.util.Date;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class NoteBookServiceImplTest {
    private NoteBookServiceImpl noteBookServiceImpl = new NoteBookServiceImpl();
    @BeforeMethod
    public void beforeMethod() {
        NoteBook noteBook = new NoteBook();
        noteBook.addNote(new Note("note 1",new Date()));
        noteBook.addNote(new Note("note 2", new Date("2015/02/03")));
        noteBook.addNote(new Note("note 1", new Date("2015/06/03")));
        noteBook.addNote(new Note("note 1", new Date("2015/02/03")));
        NoteBookProvider.setNoteBook(noteBook);
    }

    @AfterMethod
    public void afterMethod() {
        NoteBookProvider.createNoteBook();
    }
    @DataProvider(name = "SearchByText")
    public Object[][] SearchByText() {
        return new Object[][]{
                {"note", 4},
                {"2", 1},
                {"lalala", 0},
        };
    }
    @DataProvider(name = "SearchByDate")
    public Object[][] SearchByDate() {
        return new Object[][]{
                {new Date("2015/03/03"), 0},
                {new Date("2015/02/03"), 2},
        };
    }

    @DataProvider(name = "addNote")
    public Object[][] AddNote() {
        return new Object[][]{
                {"note1", new Date()},
                {"note2", new Date()},
                {"note3", new Date()},
        };
    }

    @Test(dataProvider = "SearchByText")
    public void testSearchByText(String text, int expected) throws ServiceException {
        List<Note> list = noteBookServiceImpl.searchByText(text);
        assertEquals(list.size(), expected);
    }

    @Test(dataProvider = "SearchByDate")
    public void testSearchByDate(Date date, int expected) throws ServiceException {
        List<Note> list = noteBookServiceImpl.searchByDate(date);
        assertEquals(list.size(), expected);
    }

    @Test(dataProvider = "addNote")
    public void testAddNote(String text, Date date) throws ServiceException {
        Note note = new Note(text, date);
        noteBookServiceImpl.addNote(text, date);
        assertEquals(note, NoteBookProvider.getInstance().getNoteList().get(NoteBookProvider.getInstance().getNoteList().size() - 1));
    }

    @Test
    public void testCreateNoteBook() {
        NoteBook noteBook = new NoteBook();
        assertEquals(noteBook, NoteBookProvider.createNoteBook());
    }

    @Test
    public void testGetCatalog() throws ServiceException {
        assertEquals(NoteBookProvider.getInstance().getNoteList(), noteBookServiceImpl.getNoteBook());
    }

    @Test
    public void PositiveTestReadWriteFromFile() throws Exception {
        NoteBook noteBook = NoteBookProvider.getInstance();
        noteBookServiceImpl.writeFile("4.ser");
        NoteBookProvider.createNoteBook();
        assertEquals(NoteBookProvider.getInstance(), new NoteBook());
        noteBookServiceImpl.readFile("4.ser");
        assertEquals(NoteBookProvider.getInstance(), noteBook);
    }

}
