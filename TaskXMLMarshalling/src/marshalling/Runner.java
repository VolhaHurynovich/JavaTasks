package marshalling;

import libraries.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Runner {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Library library = new Library();
        JAXBContext context = JAXBContext.newInstance(Library.class);
        Marshaller m = context.createMarshaller();
        library.setId(5);
        library.setLibraryName("Moscow library");

        m.marshal(library,new FileOutputStream("out1.xml"));
        m.marshal(library,System.out);
        System.out.println("XML created");



    }
}