package javatutorial.day05;

import java.util.Scanner;

public class classTutorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    Rectangle rect= new Rectangle(num1, num2);

    System.out.println( rect.area() );
    sc.close();
  }
}
class Rectangle{
  private double width;
  private double height;

  public Rectangle(double width, double height ) {
    this.width = width;
    this.height = height;
  }

  public double area(){
    return width * height;
  }
}
