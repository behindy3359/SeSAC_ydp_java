package javatutorial.day08.practice04;

import java.util.ArrayList;

public class LibraryUser {
    private String userName;
    private String contact;
    private int bookCount;
    private int maxBorrow = 3;
    private ArrayList<Book> book;

    public LibraryUser(String userName, String contact) {
        this.userName = userName;
        this.contact = contact;
        this.book = new ArrayList<>();
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getMaxBorrow() {
        return maxBorrow;
    }

    public void borrowBook(Book book){
        this.book.add(book);
        this.bookCount += 1;
    }
    public void returnBook(Book book){
        this.book.remove(book);
        this.bookCount -= 1;
    }
}
