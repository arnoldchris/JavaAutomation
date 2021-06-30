package software.testing.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> appConfig=new TreeMap<>();

        appConfig.put("url","SoftwareTesting.com");
        appConfig.put("username","Admin User");
        appConfig.put("password","Password123");
        appConfig.put("ipaddress","10.192.10.3");
        appConfig.put("ipaddress","10.192.14.3");
        appConfig.put("ipaddress","10.192.15.3");

        System.out.println(appConfig.get("ipaddress"));

        for(Map.Entry<String,String> config:appConfig.entrySet()){
            System.out.println(config.getKey() + "  "+ config.getValue());
        }



    }
}
