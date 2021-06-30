package software.testing.java.filehandling;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLDemo {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        XMLUtil myUtil=new XMLUtil("Module - FileHandling/src/","TestSpec.XML");

        System.out.println(myUtil.xmlReadChildNodeValue("Test","ID"));

        String value=myUtil.xmlReadChildNodeValue("Test","Browser",0);
        System.out.println(value);
    }
}
