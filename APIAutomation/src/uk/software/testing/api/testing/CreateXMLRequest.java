package uk.software.testing.api.testing;

public class CreateXMLRequest {

    public String createXML(String a, String b){
        try {

            String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                    "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"> " +
                    " <soap:Body> " +
                    //"http://www.w3.org/2001/XMLSchema-instance"
                    " <Divide xmlns=\"http://tempuri.org/\">" +
                    "<intA>"+a+"</intA>"+
                    " <intB>"+b+"</intB>" +
                    " </Divide>" +
                    " </soap:Body>" +
                    "</soap:Envelope>";
            return xml;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }



}
