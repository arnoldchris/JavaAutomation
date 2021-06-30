package uk.software.testing.api.testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveAPIResponse {


    public void saveRequest(String xml) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/TestRequest.xml"));
        writer.write(xml);

        writer.close();
    }
    public void saveResponse(StringBuffer sbf,String scenario ){

        BufferedWriter bwr = null;
        try {
            String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            fileName=scenario+"_"+fileName;
            bwr = new BufferedWriter(new FileWriter(new File("C:/"+fileName)));

        //write contents of StringBuffer to a file
        bwr.write(sbf.toString());

        //flush the stream
        bwr.flush();

        //close the stream
        bwr.close();

        System.out.println("Content of StringBuffer written to File.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

