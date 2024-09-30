package javatutorial.day08.practice04;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> store;

    public Library() {
        this.store = new ArrayList<>();
    }

    public void addBook(Book book){
        this.store.add(book);
        System.out.println("책이 추가되었습니다.");
    }
    public void deleteBook(Book book){
        this.store.remove(book);
        System.out.println("책이 삭제되었습니다.");
    }
    public void borrowBook(Book book, LibraryUser user){
        if( user.getBookCount() < user.getMaxBorrow() ){
            System.out.println("책은 3권 이상 빌릴 수 없습니다.");
        }else{
            book.borrow();
            user.borrowBook(book);
        }
    }
    public void returnBook(Book book, LibraryUser user){
        book.returnItem();
        user.returnBook(book);
    }
}
