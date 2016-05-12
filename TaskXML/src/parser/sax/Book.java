package parser.sax;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String genre;
    private String title;
    private List<Author> authors = new ArrayList<Author>();
    private int countPage;
    private int yearCreate;
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

