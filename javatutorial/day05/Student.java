package javatutorial.day05;

public class Student {

  private String name;
  private int student_ID;
  private int grade;

  public static int totalStudents = 0;

  public Student(String name, int student_ID, int grade) {
    this.name = name;
    this.student_ID = student_ID;
    this.grade = grade;
    totalStudents ++;
  }

  //getter setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStudent_ID() {
    return student_ID;
  }

  public void setStudent_ID(int student_ID) {
    this.student_ID = student_ID;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void displayInfo(){
    System.out.println("=== 학생 정보 ===");
    System.out.println("이름 :"+name);
    System.out.println("학번 :"+student_ID);
    System.out.println("학년 :"+grade);
  }
}
