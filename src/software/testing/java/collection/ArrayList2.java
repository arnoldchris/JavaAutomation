package software.testing.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList2 {

    public static void main(String[] args) {

      List<String> herbs=new LinkedList<>();
        //0
        herbs.add("Basil");//1
        herbs.add("Mint");
        herbs.add("Rosemary");//2
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add("Rosemary");//5
        herbs.add(null);
        System.out.println("The Size before removing the element is "+herbs.size());
        herbs.remove(1);
        System.out.println("The Size after removing the element is "+herbs.size());
        herbs.add(0,"Coriander");
        System.out.println("The Size after inserting the element is "+herbs.size());
        herbs.set(5,"Parsley");


        for(String hrb:herbs){
            System.out.println(hrb);
        }
        System.out.println("--------------------");
        for(int i=0; i<herbs.size(); i++){
            System.out.println(herbs.get(i));
        }



    }
}
