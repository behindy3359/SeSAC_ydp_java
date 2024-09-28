package javatutorial.day05;

import java.util.Scanner;

public class ClassTutorial4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("원의 반지름을 입력하세요 :");

    double rad = sc.nextDouble();
    Circle c = new Circle(rad);
    System.out.println("원의 반지름:" + c.radius);
    System.out.println("원의 넓이 :" + c.calcArea());

    sc.close();
  }
}
