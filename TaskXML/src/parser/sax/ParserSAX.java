package parser.sax;

import libraries.Author;
import libraries.Book;
import libraries.Library;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import java.util.ArrayList;
import java.util.List;

import static parser.sax.MenuTagName.AUTHOR;
import static parser.sax.MenuTagName.BOOK;
import static parser.sax.MenuTagName.LIBRARY;

public class ParserSAX extends DefaultHandler {
    private Library library;
    private List<Library> libraries = new ArrayList<Library>();
    private Book book;
    private Author author;
    private StringBuilder text;

    public List<Library> getLibraries() {
        return libraries;
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
        MenuTagName tagName = MenuTagName.valueOf(qName.toUpperCase().replace("-","_").substring(4));

        if (tagName.equals(LIBRARY)){
            library = new Library();
            library.setId(Integer.parseInt(attributes.getValue("ID")));
        }
        if (tagName.equals(BOOK)){
            book = new Book();
            book.setId(Integer.parseInt(attributes.getValue("ID")));
        }
        if (tagName.equals(AUTHOR)){
            author = new Author();
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        MenuTagName tagName = MenuTagName.valueOf(qName.toUpperCase().replace("-","_").substring(4));
        switch (tagName){
            case LIBRARY_NAME: library.setLibraryName(text.toString()); break;
            case LIBRARY: libraries.add(library); library = null; break;
            case BOOK: library.addBook(book); book = null; break;
            case GENRE: book.setGenre(text.toString()); break;
            case TITLE: book.setTitle(text.toString()); break;
            case AUTHOR: book.addAuthor(author); author = null;  break;
            case FIRST_NAME: author.setFirstName(text.toString()); break;
            case LAST_NAME: author.setLastName(text.toString()); break;
            case COUNT_PAGE: book.setCountPage(Integer.parseInt(text.toString())); break;
            case YEAR_CREATE: book.setYearCreate(Integer.parseInt(text.toString())); break;
            case COUNTRY: book.setCountry(text.toString()); break;
        }
    }

    public void warning(SAXParseException exception){
        System.err.println("WARNING: line " + exception.getLineNumber() + ": " + exception.getMessage());
    }

    public void error(SAXParseException exception){
        System.err.println("ERROR: line: " + exception.getLineNumber() + ": " + exception.getMessage());
    }

    public void fatalError(SAXParseException exception) throws SAXParseException {
        System.err.println("FATAL: line " + exception.getLineNumber() + ": " + exception.getMessage());
        throw (exception);
    }
}
