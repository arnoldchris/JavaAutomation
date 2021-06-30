package software.testing.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> countries=new LinkedHashSet<>();
        /*
                HashSet
                - Does not allowed Duplicate values
                - Does not maintain the insertion order
                LinkedHasSet
                - Maintain the insertion order
                - no Duplicate Values
         */
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("France");
        countries.add("Spain");
        countries.add(null);
        countries.add(null);
        countries.add("Germany");
        countries.add("Germany");
        countries.add("Germany");

        for(String con:countries){
            System.out.println(con);
        }




    }
}
