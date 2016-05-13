package libraries;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "lib:Library")
@XmlAccessorType(XmlAccessType.FIELD)

public class Library {
    @XmlElement(name = "lib:Book")
    private List<Book> books = new ArrayList<Book>();
    @XmlElement(required = true)
    private String libraryName;
    @XmlAttribute(required = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
