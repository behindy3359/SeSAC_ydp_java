package javatutorial.day04;

import java.util.Scanner;

public class ClassTutorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
    double num1 =sc.nextDouble();
//    double num2 =sc.nextDouble();
    Rectangle rect= new Rectangle(num1);
//    System.out.println( rect.area() );
  }
}
class Rectangle{
  private double width;
  private double height;

  public Rectangle(double width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void area(){


  }
}