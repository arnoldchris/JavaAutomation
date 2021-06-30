package software.testing.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
//This is the comment
    /*

     */
    public static void main(String[] args) {

        try {
            //Relative path
            //Absolute path
            //C:\Users\chris\IdeaProjects\JavaAutomation\Module - FileHandling\src\applicationConfig.properties

            FileInputStream fis = new FileInputStream("Module - FileHandling\\src\\applicationConfig.properties");
            Properties props = new Properties();
            props.load(fis);

            String uName=props.getProperty("browser");

            System.out.println(uName);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
