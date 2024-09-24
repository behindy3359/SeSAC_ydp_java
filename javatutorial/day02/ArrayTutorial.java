package javatutorial.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayTutorial {
  public static void main(String[] args) {

    List<Integer> arraySet = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("5개의 정수를 입력하세요");
    arraySet.add(sc.nextInt());
    arraySet.add(sc.nextInt());
    arraySet.add(sc.nextInt());
    arraySet.add(sc.nextInt());
    arraySet.add(sc.nextInt());

    System.out.println("평균은 >>>> " +calcAvg(arraySet));

    sc.close();
  }

  public static float calcAvg(List<Integer> list){

    if (list == null || list.isEmpty()) {
      return 0;
    }

    float sum = 0;

    for (int num : list) {
      sum += num;
    }

    return sum/list.size();
  }
}
