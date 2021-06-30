package software.testing.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
    /*
            Array List and Linked List
            - Allows Duplicate values
            - Allows Null Values
            - It maintains the insertion order
     */
        numbers.add(130);
        numbers.add(120);
        numbers.add(30);

        int i=10;
        Integer num=i; //Changing primitive data type to reference - Auto-Boxing

        int x=num.intValue(); // ref to primitive - Auto - unboxing

        double d=10.30;
        Double d1=d;
        double c=d1.doubleValue();

        char c1='A';
        Character ch=c1;
        char t=ch.charValue();

        ListIterator<Integer> iter=numbers.listIterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
        List<Book> myBooks=new LinkedList<>();
        myBooks.add(new Book(1223,"Java"));
        myBooks.add(new Book(234,"Oracle"));
        myBooks.add(new Book(45,"Dot Net"));

        for(Book bk:myBooks){
            System.out.println(bk.getBookId() + "  "+ bk.getBookName());
        }


    }
}
