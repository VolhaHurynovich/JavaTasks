package parser.sax;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;


import java.util.ArrayList;
import java.util.List;

public class ParserSAX extends DefaultHandler {
    private Library library;
    private List<Book> bookList = new ArrayList<Book>();
    private Book book;
    private List<Author> authors = new ArrayList<Author>();
    private Author author;
    private StringBuilder text;

    public Library getLibrary() {
        return library;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void endDocument() {
        System.out.println("Stop parse XML...");
    }

    @Override
    public void characters(char[] buffer, int start, int length) {
        text.append(buffer, start, length);
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) throws SAXException {
        text = new StringBuilder();
        if (qName.equals("book")){
            book = new Book();
            book.setId(Integer.parseInt(attributes.getValue("id")));
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        MenuTagName tagName = MenuTagName.valueOf(qName.toUpperCase().replace("-","_"));
        switch (tagName){
            case LIBRARY_NAME: library.setLibraryName(text.toString()); break;
            case LIBRARY: library.setBooks(bookList);  break;
            case BOOK: bookList.add(book); book = null; break;
            case GENRE: book.setGenre(text.toString()); break;
            case TITLE: book.setTitle(text.toString()); break;
            case AUTHOR: authors.add(author); author = null;  break;
            case FIRST_NAME: author.setFirstName(text.toString()); break;
            case LAST_NAME: author.setLastName(text.toString()); break;
            case COUNT_PAGE: book.setCountPage(Integer.parseInt(text.toString())); break;
            case YEAR_CREATE: book.setYearCreate(Integer.parseInt(text.toString())); break;
            case COUNTRY: book.setCountry(text.toString()); break;
        }
    }
}
