package software.testing.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //ArrayList
        /*
            Allows Duplicate values
            Allows Null Values
         */
        LinkedList<String> herbs=new LinkedList<>();
        herbs.add("Basil");
        herbs.add("Thyme");
        herbs.add("Mint");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add(null);
        herbs.add("End");
        herbs.remove(1);
        herbs.set(5,"Parsley");

        //For each loop
        for(String str:herbs){
            System.out.println(str);
        }
        System.out.println("-------------- For loop with index");
        for(int i=0; i<herbs.size();i++){
            System.out.println(herbs.get(i));
        }

    }
}
