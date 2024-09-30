package javatutorial.day07;

public abstract class Student {
    String name;
    String school;
    int age;
    int IDNumber;

    public Student(String name, String school, int age, int IDNumber) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.IDNumber = IDNumber;
    }
    abstract void todo();
}
