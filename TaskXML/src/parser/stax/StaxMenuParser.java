package parser.stax;

import libraries.Author;
import libraries.Book;
import libraries.Library;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StaxMenuParser {
    public static void main(String[] args) throws FileNotFoundException {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        try {
            InputStream input = new FileInputStream("res/XML_1.xml");
            XMLStreamReader reader = inputFactory.createXMLStreamReader(input);
            List<Library> libraries = process(reader);
            for (Library library : libraries) {
                System.out.println(library.getLibraryName());
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private static List<Library> process(XMLStreamReader reader) throws XMLStreamException {
        List<Library> libraries = new ArrayList<Library>();
        Book book = null;
        Author author = null;
        Library library = null;
        MenuTagName elementName = null;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    elementName = MenuTagName.getElementTagName(reader.getLocalName());
                    switch (elementName) {
                        case LIBRARY:
                            library = new Library();
                            library.setId(Integer.parseInt(reader.getAttributeValue(null, "ID")));
                            break;
                        case BOOK:
                            book = new Book();
                            book.setId(Integer.parseInt(reader.getAttributeValue(null, "ID")));
                            break;
                        case AUTHOR:
                            author = new Author();
                            break;
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    String text = reader.getText().trim();
                    if (text.isEmpty()) {
                        break;
                    }
                    switch (elementName) {
                        case LIBRARY_NAME:
                            library.setLibraryName(text.toString());
                            break;
                        case GENRE:
                            book.setGenre(text.toString());
                            break;
                        case TITLE:
                            book.setTitle(text.toString());
                            break;
                        case FIRST_NAME:
                            author.setFirstName(text.toString());
                            break;
                        case LAST_NAME:
                            author.setLastName(text.toString());
                            break;
                        case COUNT_PAGE:
                            book.setCountPage(Integer.parseInt(text.toString()));
                            break;
                        case YEAR_CREATE:
                            book.setYearCreate(Integer.parseInt(text.toString()));
                            break;
                        case COUNTRY:
                            book.setCountry(text.toString());
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    elementName = MenuTagName.getElementTagName(reader.getLocalName());
                    switch (elementName) {
                        case LIBRARY:
                            libraries.add(library);
                            library = null;
                            break;
                        case BOOK:
                            library.addBook(book);
                            book = null;
                            break;
                        case AUTHOR:
                            book.addAuthor(author);
                            author = null;
                            break;
                    }
            }
        }
        return libraries;
    }
}
