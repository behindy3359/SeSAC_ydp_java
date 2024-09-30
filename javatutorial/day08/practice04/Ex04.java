package javatutorial.day08.practice04;

public class Ex04 {
    public static void main(String[] args) {
        Library 동작도서관 = new Library();
        LibraryUser 김창식 = new LibraryUser("김창식", "010-1234-5124");
        Book 책1 = new Book("책1", "나", "너",2012);

        동작도서관.addBook(책1);
        동작도서관.borrowBook(책1, 김창식);
        동작도서관.returnBook(책1, 김창식);
    }
}
