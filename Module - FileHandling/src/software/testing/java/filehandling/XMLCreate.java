package software.testing.java.filehandling;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XMLCreate {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        //Create a DocumentBuilder instance
        //document from the above document builder
        //create elements
        //child elements
        //write the file to your harddisk

        DocumentBuilderFactory docmentFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder=docmentFactory.newDocumentBuilder();
        Document document=documentBuilder.newDocument();
        Element root=document.createElement("company");
        document.appendChild(root);

        Element employee=document.createElement("employee");
        root.appendChild(employee);
        document.createElement("employee");

        Element firstName=document.createElement("firstName");
        firstName.appendChild(document.createTextNode("Arnold"));
        employee.appendChild(firstName);

        Element lastName=document.createElement("lastName");
        lastName.appendChild(document.createTextNode("Christian"));
        employee.appendChild(lastName);

        Element department=document.createElement("department");

        root.appendChild(department);
        document.createElement("department");

        Element sales=document.createElement("sales");
        sales.appendChild(document.createTextNode("Sales"));
        department.appendChild(sales);
        //create XML File


        String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String path="C:/myFile";
        path=path.concat(fileName);
        path=path.concat(".XML");
        TransformerFactory transformer= TransformerFactory.newInstance();
        Transformer transformer1=transformer.newTransformer();
        DOMSource domSource=new DOMSource(document);
        StreamResult streamResult=new StreamResult(new File(path));
        transformer1.transform(domSource,streamResult);
        System.out.println("File created");




    }
}
