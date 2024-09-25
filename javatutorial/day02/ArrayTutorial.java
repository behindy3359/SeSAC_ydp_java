package javatutorial.day02;

import java.util.Scanner;

public class ArrayTutorial {
  public static void main(String[] args) {
//    List<Integer> arraySet = new ArrayList<>();
    int[] listSet = new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.println("5개의 정수를 입력하세요");
    listSet[0]=(sc.nextInt());
    listSet[1]=(sc.nextInt());
    listSet[2]=(sc.nextInt());
    listSet[3]=(sc.nextInt());
    listSet[4]=(sc.nextInt());

    System.out.println("평균은 >>>> " + calcAvg(listSet));

    sc.close();
  }

  public static float calcAvg(int[] list){
    float sum = 0;

    for (int num : list) {
      sum += num;
    }

    return sum/list.length;
  }
}
