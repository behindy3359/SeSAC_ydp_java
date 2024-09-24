package javatutorial.day02;

import java.util.*;

public class exceptionTutorial {
  public static void main(String[] args) {
    firstTestException();
    secondTestException();
    thirdTestException();
  }

  public static void firstTestException(){
    int[] array = new int[]{1,2,3,4};

    try {
      for(int i = 0 ; i < 5 ; i ++){
        System.out.println(array[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("인덱스가 범위를 벗어났습니다.");
    }
  }

  private static void secondTestException() {
    Scanner sc = new Scanner(System.in);
    try{
      //input ArraySize
      System.out.println("배열 크기를 입력해주세요 : ");
      int arraySize = sc.nextInt();

      if (arraySize > Integer.MAX_VALUE){
        throw new IllegalArgumentException( Integer.MAX_VALUE + "보다 작은 숫자를 입력해주세요");
      }
      if(arraySize <= 0){
        throw new IllegalArgumentException("0 보다 큰 정수를 입력해주세요");
      }

      ArrayList<Integer> array = new ArrayList<>();

      //create Array
      for(int i = 0; i < arraySize ; i ++){
        array.add(i+1);
      }

      //calc Avg
      float sum = 0;

      for (int i : array){
        sum += i;
      }

      System.out.println("sum = " + sum);

      //print out avg
      System.out.println((float)sum/array.size());

    }catch (InputMismatchException e ){
      System.out.println("배열의 크기를 정수로 입력해주세요");
    }catch (IllegalStateException e){
      System.out.println(e.getMessage());
    }
  }

  private static void thirdTestException() {

    Scanner sc = new Scanner(System.in);
    try {
      //input ArraySize
      System.out.println("배열 크기를 입력해주세요 : ");
      int arraySize = sc.nextInt();

      if (arraySize > Integer.MAX_VALUE){
        throw new IllegalArgumentException( Integer.MAX_VALUE + "보다 작은 숫자를 입력해주세요");
      }
      if(arraySize <= 0){
        throw new IllegalArgumentException("0 보다 큰 정수를 입력해주세요");
      }

      ArrayList<Integer> array = new ArrayList<>();

      //create Array
      for(int i = 0 ; i < arraySize ; i ++){
        System.out.println("배열 요소를 입력해주세요 : ");
        int tempNumber = sc.nextInt();
        array.add(tempNumber);
      }

      Map<Integer, List<Integer>> groups = new HashMap<>();
      for (int num : array) {
        groups.putIfAbsent(num, new ArrayList<>());
        groups.get(num).add(num);
      }

      for (List<Integer> group : groups.values()) {
        if (group.size() > 1) {
          System.out.print(group);
        }
      }

    } catch (InputMismatchException e ){
      System.out.println("정수를 입력해주세요");
    }
  }
}
