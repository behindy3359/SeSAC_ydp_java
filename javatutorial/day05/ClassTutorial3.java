package javatutorial.day05;

import java.util.ArrayList;

public class ClassTutorial3 {
  public static void main(String[] args) {
    ArrayList<Student> std = new ArrayList<>();

    std.add(new Student("김새싹", 20240101, 1));
    std.add(new Student("박지은", 20230101, 2));
    std.add(new Student("이은지", 20220101, 3));

    for (Student s : std){
      s.displayInfo();
    }
    System.out.printf("\n총 학생 수는 %d 명 입니다.", Student.totalStudents);
  }
}
