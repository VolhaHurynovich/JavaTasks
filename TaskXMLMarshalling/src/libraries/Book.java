package libraries;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lib:Book", propOrder = {"lib:Genre","lib:Title","lib:Author","lib:Count-Page","lib:Year-Create","lib:Country"})
public class Book {
    @XmlAttribute(required = true)
    private int id;
    @XmlElement(required = true)
    private String genre;
    @XmlElement(required = true)
    private String title;
    @XmlElement(required = true)
    private List<Author> authors = new ArrayList<Author>();
    @XmlElement(required = true)
    private int countPage;
    @XmlElement(required = true)
    private int yearCreate;
    @XmlElement(required = true)
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public void setYearCreate(int yearCreate) {
        this.yearCreate = yearCreate;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getCountPage() {
        return countPage;
    }

    public int getYearCreate() {
        return yearCreate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

}

