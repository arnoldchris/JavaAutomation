package software.testing.java.filehandling;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.log4j.Logger;

public class XMLUtil {

    /** Path to the file. */
    private String filePath;
    /** Name of the file. */
    private String fileName;
    /** XML Document. */
    private static Document doc;

    /** Log4j Logger. */
    //private static final Logger LOG = Logger.getLogger(XMLUtil.class);

    /**
     * Initializer.
     * @param filePath path to the file
     * @param fileName name of the file
     * @throws ParserConfigurationException if the parse can't be configured
     * @throws IOException if the document can't be read
     * @throws SAXException if the document can't be processed
     */
    public XMLUtil(final String filePath, final String fileName) throws ParserConfigurationException, IOException, SAXException {
        this.setFilePath(filePath);
        this.setFileName(fileName);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(filePath+fileName);
        XMLUtil.setDocument(doc);
    }

    /**
     * This method uses DOM Parser to Read Tag Attribute Value in a Specified Node.
     * @author Arnold.Christian
     * @throws Throwable
     * @param tagName - Root Element ex: <JourneySegment
     * @param childNode -  childNode in the xml for which the value needs to be fetched
     * @return the text from the node
     */
    public String xmlReadChildNodeValue(final String tagName, final String childNode) {
        String returnValue = null;

        // Get the tagNode element by tag name directly
        Node tagNode = getDocument().getElementsByTagName(tagName).item(0);

        // loop the tagName child node
        NodeList list = tagNode.getChildNodes();
        for(int i=0; i<list.getLength(); i++){
            Node node = list.item(i);
            if(childNode.equals(node.getNodeName())){
                returnValue = node.getTextContent();
                break;
            }
        }
        return returnValue;
    }

    public String xmlReadChildNodeValue(final String tagName, final String childNode, int nodeIndex) {
        String returnValue = null;

        // Get the tagNode element by tag name directly
        Node tagNode = getDocument().getElementsByTagName(tagName).item(nodeIndex);

        // loop the tagName child node
        NodeList list = tagNode.getChildNodes();
        for(int i=0; i<list.getLength(); i++){
            Node node = list.item(i);
            if(childNode.equals(node.getNodeName())){
                returnValue = node.getTextContent();
                break;
            }
        }
        return returnValue;
    }


    /**
     * This method uses DOM Parser to Read Tag Attribute Value in a Specified Node.
     * @author Arnold.Christian
     * @throws Throwable
     * @param tagName - Root Element ex: <JourneySegment
     * @param childNode -  childNode in the xml for which the value needs to be modified
     * @param nodeValue -  value to modify for the mentioned childNode
     * @throws TransformerException if something goes wrong
     */
    public void xmlModifyChildNodeValue(final String tagName, final String childNode, final String nodeValue) throws TransformerException {

        // Get the tagNode element by tag name directly
        Node tagNode = getDocument().getElementsByTagName(tagName).item(0);

        // loop the tagName child node
        NodeList list = tagNode.getChildNodes();
        for(int i=0; i<list.getLength(); i++){
            Node node = list.item(i);
            if(childNode.equals(node.getNodeName())){
                node.setTextContent(nodeValue);
                break;
            }
        }
        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(getDocument());
        StreamResult result = new StreamResult(new File(getFilePath()+getFileName()));
        transformer.transform(source, result);

    }

    public void xmlModifyChildNodeValue(final String tagName, final String childNode, final String nodeValue, int nodeIndex) throws TransformerException {

        // Get the tagNode element by tag name directly
        Node tagNode = getDocument().getElementsByTagName(tagName).item(nodeIndex);

        // loop the tagName child node
        NodeList list = tagNode.getChildNodes();
        for(int i=0; i<list.getLength(); i++){
            Node node = list.item(i);
            if(childNode.equals(node.getNodeName())){
                node.setTextContent(nodeValue);
                break;
            }
        }

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(getDocument());
        StreamResult result = new StreamResult(new File(getFilePath()+getFileName()));
        transformer.transform(source, result);

    }

    /**
     * This method uses DOM Parser to Read Tag Attribute Value in a Specified Node.
     * @author Arnold.Christian
     * @param tagName - Root Element ex: <JourneySegment
     * @param attribute -  any attribute in the xml for which the value needs to be fetched
     * @return the text from the node
     */
    public String xmlReadTagAttributeValue(final String tagName, final String attribute) {
        // Get the tagNode element by tag name directly
        Node tagNode = getDocument().getElementsByTagName(tagName).item(0);

        // Read tagNode attribute
        NamedNodeMap attr = tagNode.getAttributes();
        Node nodeAttr = attr.getNamedItem(attribute);
        return nodeAttr.getTextContent();
    }

    /**
     * Set content of the tagNode element by tag name directly.
     * @param tagName name of the tag
     * @param value the value to set the content to
     * @throws TransformerException when something goes wrong
     */
    public void xmlModifyNodeValue(final String tagName, final String value) throws TransformerException {

        NodeList carriers = (NodeList) getDocument().getElementsByTagName(tagName);

        for (int i = 0; i < carriers.getLength(); i++) {
            Node carrier = (Node) carriers.item(i);
            carrier.setTextContent(value);
        }

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(getDocument());
        StreamResult result = new StreamResult(new File(getFilePath()+getFileName()));
        transformer.transform(source, result);

        //NamedNodeMap nodeValue = tagNode.getNodeValue();

    }

    /**
     * This method uses DOM Parser to Read Tag Attribute Value in a Specified Node.
     * @author Arnold.Christian
     * @throws Throwable
     * @param tagName - Root Element ex: <JourneySegment
     * @param attribute -  any attribute in the xml for which the value needs to be modified
     * @param attributeValue -  value to modify for the mentioned Attribute
     * @throws TransformerException if the transformation fails
     */

    public void xmlModifyTagAttributeValue(final String tagName, final String attribute, final String attributeValue) throws TransformerException {

        // Get the tagNode element by tag name directly
        Node tagNode = getDocument().getElementsByTagName(tagName).item(0);

        if (tagNode != null){
            // update tagNode attribute
            NamedNodeMap attr = tagNode.getAttributes();
            Node nodeAttr = attr.getNamedItem(attribute);
            nodeAttr.setTextContent(attributeValue);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(getDocument());
            StreamResult result = new StreamResult(new File(getFilePath()+getFileName()));
            transformer.transform(source, result);
        } else {
            //  LOG.warn("Unable to retrieve node for tag: " + tagName);
        }
    }

    /**
     * Getter.
     * @return the filePath
     */
    String getFilePath() {
        return filePath;
    }

    /**
     * Setter.
     * @param filePath the filePath to set
     */
    void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    /**
     * Getter.
     * @return the fileName
     */
    String getFileName() {
        return fileName;
    }

    /**
     * Setter.
     * @param fileName the fileName to set
     */
    void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    /**
     * Getter.
     * @return the doc
     */
    static Document getDocument() {
        return doc;
    }

    /**
     * Setter.
     * @param doc the doc to set
     */
    static void setDocument(final Document doc) {
        XMLUtil.doc = doc;
    }

public void createXML(Document document,String fileName){

    TransformerFactory transformer= TransformerFactory.newInstance();
    Transformer transformer1= null;
    try {
        transformer1 = transformer.newTransformer();
    } catch (TransformerConfigurationException e) {
        e.printStackTrace();
    }
    String timeStamp = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());
    fileName=fileName.concat(timeStamp);
    DOMSource domSource=new DOMSource(document);
    StreamResult streamResult=new StreamResult(new File(fileName));
    try {
        transformer1.transform(domSource,streamResult);
    } catch (TransformerException e) {
        e.printStackTrace();
    }
    System.out.println("File created");
}
}

