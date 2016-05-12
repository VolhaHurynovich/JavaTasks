package parser.sax;

import libraries.Library;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws SAXException, IOException, jdk.internal.org.xml.sax.SAXException {
        XMLReader reader =  XMLReaderFactory.createXMLReader();
        ParserSAX handler = new ParserSAX();
        reader.setContentHandler(handler);
        reader.parse(new InputSource("res/XML_1.xml"));
        List<Library> libraries = handler.getLibraries();
        System.out.println("Count of libraries: " + libraries.size());
    }
}
