package parser.stax;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StAXWriter {
    public static void main(String[] args)  {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try{
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("res/out_1.xml"));
            writer.writeStartDocument();
            writer.writeStartElement("document");
            writer.writeStartElement("data");
            writer.writeAttribute("name","value");
            writer.writeCharacters("content");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
