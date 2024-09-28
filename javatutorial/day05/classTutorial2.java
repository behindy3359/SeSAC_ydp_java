package javatutorial.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class classTutorial2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Rectangle3> rectList = new ArrayList<>();

    int rectIndex = 0;
    while ( true ){
      System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");

      double num1 =sc.nextDouble();
      double num2 =sc.nextDouble();

      if( num1== 0 && num2 == 0){
        break;
      }

      rectList.add(new Rectangle3(num1));
      rectList.get(rectIndex).setHeight(num2);

      rectIndex++ ;
    }

    for( Rectangle3 r : rectList){
      System.out.println("가로 길이는 : " + r.getWidth());
      System.out.println("세로 길이는 : " + r.getHeight());
      System.out.println("넓이는 : "+ r.area());
      System.out.println("-----------------------------------------------");
    }
    System.out.println("Rectangle2 인스턴스의 개수는 : " + Rectangle3.count);

    sc.close();
  }
}