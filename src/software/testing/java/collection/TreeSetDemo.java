package software.testing.java.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<String> countries=new TreeSet<>();
    /*
            Tree Set:
                - Sort out the elements
                - Does not allow null
                - Does not allow duplicates
     */
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("France");
        countries.add("Spain");
       // countries.add(null);
       // countries.add(null);
        countries.add("Germany");
        countries.add("Germany");
        countries.add("Germany");

        for(String con:countries){
            System.out.println(con);
        }

        System.out.println("----------------------");

        Set <Book> myBooks=new TreeSet<>();
        myBooks.add(new Book(1423,"java"));
        myBooks.add(new Book(234,"Oracle"));
        myBooks.add(new Book(756,"Dot Net"));
        myBooks.add(new Book(2,"Automation Testing"));
        myBooks.add(new Book(7777,"Selenium"));
        myBooks.add(new Book(98934, "Web Driver"));

        for(Book bk:myBooks){
            System.out.println(bk.getBookId() + "   "+bk.getBookName());
        }

    }
}
