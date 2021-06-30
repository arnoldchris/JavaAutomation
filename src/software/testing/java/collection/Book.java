package software.testing.java.collection;

public class Book implements Comparable<Book>{
    private int bookId;
    private String bookName;

    public Book(int bookId,String bookName){
        this.bookId=bookId;
        this.bookName=bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public int compareTo(Book otherBook) {
        if(bookId>otherBook.getBookId()){
            return -1;
        }else if(bookId< otherBook.getBookId()){
            return 1;
        }else{
            return 0;
        }

    }


}
