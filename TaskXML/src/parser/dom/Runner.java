package parser.dom;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import libraries.Author;
import libraries.Book;
import libraries.Library;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse("res/XML_1.xml");
        Document document = parser.getDocument();
        Element root = document.getDocumentElement();
        List<Library> libraries = new ArrayList<Library>();
        NodeList libraryNodes = root.getElementsByTagName("lib:Library");
        Library library = null;
        Book book = null;
        Author author = null;

        for(int i = 0;i < libraryNodes.getLength();i++){
            library = new Library();
            Element libraryElement = (Element) libraryNodes.item(i);
            library.setId(Integer.parseInt(libraryElement.getAttribute("ID")));
            library.setLibraryName(getSingleChild(libraryElement,"lib:Library-Name").getTextContent().trim());

            NodeList booksNodes = libraryElement.getElementsByTagName("lib:Book");
            for(int j = 0;j < booksNodes.getLength();j++){
                book = new Book();
                Element bookElement = (Element) booksNodes.item(j);
                book.setGenre(getSingleChild(bookElement,"lib:Genre").getTextContent().trim());
                book.setTitle(getSingleChild(bookElement,"lib:Title").getTextContent().trim());

                NodeList authorsNodes = bookElement.getElementsByTagName("lib:Author");
                for(int z = 0;z < authorsNodes.getLength();z++){
                    author = new Author();
                    Element authorElement = (Element) authorsNodes.item(z);
                    author.setFirstName(getSingleChild(authorElement,"lib:First-Name").getTextContent().trim());
                    author.setLastName(getSingleChild(authorElement,"lib:Last-Name").getTextContent().trim());
                    book.addAuthor(author);
                }
                book.setCountPage(Integer.parseInt(getSingleChild(bookElement,"lib:Count-Page").getTextContent().trim()));
                book.setYearCreate(Integer.parseInt(getSingleChild(bookElement,"lib:Year-Create").getTextContent().trim()));
                book.setCountry(getSingleChild(bookElement,"lib:Country").getTextContent().trim());
                library.addBook(book);
            }
            libraries.add(library);
        }

        System.out.println("Count of libraries: " + libraries.size());
    }

    private static Element getSingleChild(Element element, String childName) {
        NodeList nlist = element.getElementsByTagName(childName);
        Element child = (Element) nlist.item(0);
        return child;
    }
}
