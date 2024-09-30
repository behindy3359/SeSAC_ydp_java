package javatutorial.day07;

public class Kim extends Student{
    private String lunch;
    private String hobby;

    public Kim(String name, String school, int age, int IDNumber, String lunch, String hobby) {
        super(name, school, age, IDNumber);
        this.lunch = lunch;
        this.hobby = hobby;
    }

    @Override
    void todo(){
        System.out.println("점심은 김가네 김밥");
    }

    void studentInfo(){
        System.out.println("=== kim 학생의 정보 ===");
        System.out.println("학교 : " + school);
        System.out.println("나이 : " + age);
        System.out.println("학번 : " + IDNumber);
        todo();
    }
}

