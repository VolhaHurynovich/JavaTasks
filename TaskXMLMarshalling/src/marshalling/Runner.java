package marshalling;

import libraries.Author;
import libraries.Book;
import libraries.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Runner {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Library library = new Library();
        Book book = new Book();
        Author author = new Author();
        JAXBContext context = JAXBContext.newInstance(Library.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.epam.example.org/Library");


        library.setId(5);
        library.setLibraryName("Moscow library");
        book.setId(1111);
        book.setGenre("Novel");
        book.setYearCreate(1222);
        book.setCountry("Belarus");
        book.setCountPage(133);
        book.setTitle("My book");

        author.setFirstName("rrr");
        author.setLastName("ttt");
        book.addAuthor(author);

        library.addBook(book);

        m.marshal(library,new FileOutputStream("out1.xml"));
        m.marshal(library,System.out);
        System.out.println("XML created");



    }
}