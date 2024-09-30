package javatutorial.day08.practice04;

public class Book implements Borrowable {
    private String title;
    private String author;
    private String publisher;
    private int birth;

    private boolean isHere = true;

    public Book(String title, String author, String publisher, int birth) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.birth = birth; // 출판 연도
    }

    public void setHere(boolean here) {
        isHere = here;
    }

    @Override
    public void borrow() {
        if(isHere){
            System.out.println("책을 대출하였습니다." + title);
            setHere(false);
        }else{
            System.out.println("이미 대출되어 있는 상태 입니다.");
        }
    }

    @Override
    public void returnItem() {
        if(!isHere){
            System.out.println("책을 반납하였습니다." + title);
            setHere(true);
        }else{
            System.out.println("이미 반납되어 있는 상태 입니다.");
        }
    }
}
