package uk.software.testing.api.testing;

public class APITestRunner {
    //APITest.xlsx
    public static ExcelReader myReader=new ExcelReader("APIAutomation/src/uk/software/testing/api/testing/API Test.xlsx","TestData");
    public static void main(String[] args) {
        //

        APITestRunner myData=new APITestRunner();
        Object obj[][]=myData.getXLSData();

        PostHTTPRequest postHTTPRequest=new PostHTTPRequest();

        StringBuffer strBuff=new StringBuffer();

        SaveAPIResponse saveAPIResponse=new SaveAPIResponse();

        CreateXMLRequest cr=new CreateXMLRequest();

        for(int i=1; i<myReader.getRowCount(); i++){
            String xml=cr.createXML(obj[i][1].toString(),obj[i][2].toString());
            strBuff=postHTTPRequest.postHttp(xml);
            saveAPIResponse.saveResponse(strBuff,obj[i][0].toString());
        }
    }
    public Object[][] getXLSData(){
      int rows=myReader.getRowCount();
      int cols= myReader.getColumnCount();
      Object myData[][]=new Object[rows][cols];
      for(int i=0; i<rows; i++){
          for(int j=0; j<cols; j++){
              myData[i][j]=myReader.getCellValue(i,j);
              System.out.print(myData[i][j]+ "  ");
          }
          System.out.println();
      }

        return  myData;
    }


}
