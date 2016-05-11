package parser.sax;

import jdk.internal.org.xml.sax.ContentHandler;
import jdk.internal.org.xml.sax.InputSource;
import jdk.internal.org.xml.sax.XMLReader;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) throws SAXException, IOException, jdk.internal.org.xml.sax.SAXException {
        XMLReader reader = (XMLReader) XMLReaderFactory.createXMLReader();
        ParserSAX handler = new ParserSAX();
        reader.setContentHandler((ContentHandler) handler);
        reader.parse(new InputSource("res/XML_1.xml"));
        Library library = handler.getLibrary();

    }
}
