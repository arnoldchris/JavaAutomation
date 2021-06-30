package software.testing.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //ArrayList<int> number=new ArrayList<>();

        // Primitive Datatypes not allowd with the collections classes.
        /*
            Primitive DataType                  Wrapper Class (Java.lang package)
            int                                 Integer
            float                               Float
            double                              Double
            long                                Long
            short                               Short
            char                                Character
            boolean                             Boolean
         */

        int i=10;
        Integer num=i; //Changing primitive to reference data type - Auto - Boxing
        int x=num.intValue(); //change ref data type to prmitive dat type - Auto - unboxing

        char ch='A';
        Character chr=ch;
        char k=chr.charValue();

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for(Integer numb:numbers){
            System.out.println(numb);
        }

        System.out.println("----------------------------");
        ListIterator<Integer> listIterator  = numbers.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--------------");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        List<Book> myBooks=new LinkedList<>();

        myBooks.add(new Book(123,"Java"));
        myBooks.add(new Book(234,"Oracle"));
        myBooks.add(new Book(456,"DotNet"));

        for(Book bk:myBooks){
            System.out.println(bk.getBookId()+"   "+ bk.getBookName());
        }




    }
}
