package libraries;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lib:Library", propOrder = {"lib:Book","lib:Library-Name"})

public class Library {
    @XmlElement(type = Book.class, required = true)
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
