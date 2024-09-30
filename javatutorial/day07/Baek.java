package javatutorial.day07;

public class Baek extends Student{
    private String lunch;
    private String hobby;

    public Baek(String name, String school, int age, int IDNumber, String lunch, String hobby) {
        super(name, school, age, IDNumber);
        this.lunch = lunch;
        this.hobby = hobby;
    }

    @Override
    void todo(){
        System.out.println("점심은 백종원피자");
    }

    void studentInfo(){
        System.out.println("=== Baek 학생의 정보 ===");
        System.out.println("학교 : " + school);
        System.out.println("나이 : " + age);
        System.out.println("학번 : " + IDNumber);
        todo();
    }
}
