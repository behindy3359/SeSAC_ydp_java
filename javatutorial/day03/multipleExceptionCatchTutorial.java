package javatutorial.day03;

import java.util.*;

public class multipleExceptionCatchTutorial {
    public static void main(String[] args) {
//        ExceptionTest1();
//        ExceptionTest2();
        ExceptionTest3();
    }

    public static void ExceptionTest1(){
        try {
            int[] array = new int[4];
            for( int i = 0 ; i <= 5 ; i ++ ){
                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e ){
            System.err.println("인덱스가 배열의 범위를 벗어났습니다 :" + e.getMessage());
        }
    }
    public static void ExceptionTest2(){
        Scanner sc = null;
        System.out.println("ExceptionTest2을 시작 합니다.");
        try {
            sc = new Scanner(System.in);
            System.out.print("배열의 크기를 입력해주세요 >>");
            String input = sc.nextLine();

            // 문자열을 정수로 변환
            int arraySize = Integer.parseInt(input);

            ArrayList<Integer> array = new ArrayList<>();
            for ( int i = 0 ; i < arraySize ; i ++){
                array.add(i);
            }
            int sum = 0;

            for( int i = 0 ; i < array.size() ; i ++){
                sum += (i+1);
            }

            float avg = sum / array.size();
            System.out.println(" 배열 요소의 평균 >> " +avg);
            sc.close();
        } catch ( NumberFormatException e ){
            System.err.println("입력 형식이 잘못되었습니다." + e.getMessage());
        } catch ( ArithmeticException e ){
            System.err.println("배열의 크기는 0이 될 수 없습니다." + e.getMessage());
        } catch ( ArrayIndexOutOfBoundsException e ){
            System.err.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
        } catch (Exception e){ // 예상치 못한 예외나 명시하지 못한 예외를 잡는 마지막 방어선
            System.err.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
        } finally {
            System.out.println("ExceptionTest2을 종료합니다.");
            if(sc != null){
                sc.close();
            }
        }
    }
    public static void ExceptionTest3(){
        Scanner sc = null;
        System.out.println("ExceptionTest3을 시작 합니다.");
        try {
            sc = new Scanner(System.in);
            System.out.print("배열의 크기를 입력해주세요 >>");
            String input = sc.nextLine();
            // 문자열을 정수로 변환
            int arraySize = Integer.parseInt(input);

            ArrayList<Integer> array = new ArrayList<>();
            System.out.println("배열 요소를 입력하십시오 : ");
            for ( int i = 0 ; i < arraySize ; i ++){
                String tempInput = sc.next();
                int inputNumber = Integer.parseInt(tempInput);
                array.add(inputNumber);
            }
            sc.close();

            for( int i =0 ; i < array.size() ; i++){
                ArrayList<Integer> tempArray = new ArrayList<>();
                for( int j = i ; j <  array.size() ; j ++){
                    tempArray.add(array.get(i));
                }
                System.out.print(tempArray);
            }

        } catch ( NumberFormatException e ){
            System.err.println("입력 형식이 잘못되었습니다." + e.getMessage());
            e.printStackTrace();
        } catch ( ArithmeticException e ){
            System.err.println("배열의 크기는 0이 될 수 없습니다." + e.getMessage());
            e.printStackTrace();
        } catch ( ArrayIndexOutOfBoundsException e ){
            System.err.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e){ // 예상치 못한 예외나 명시하지 못한 예외를 잡는 마지막 방어선
            System.err.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("\nExceptionTest3을 종료합니다.");
            if(sc != null){
                sc.close();
            }
        }
    }
}
