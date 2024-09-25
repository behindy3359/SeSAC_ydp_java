package javatutorial.day03;

import java.util.Arrays;
import java.util.Scanner;

public class multipleCatchEx {
    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            System.out.println("숫자를 입력하세요 >>");
            String input = sc.nextLine();

            // 문자열을 정수로 변환
            int number = Integer.parseInt(input);

            // 숫자를 0으로 나누기
            int result = 100/number;
            System.out.println("100을"+ number+"로 나눈 결과 >>"+ result);

            // 배열 접근  시도
            int[] array = new int[5];
            array[number] = 10;
            System.out.println(number + "인덱스의 값을 10으로 수정했습니다."+ Arrays.toString(array));

        } catch ( NumberFormatException e ){
            System.err.println("입력 형식이 잘못되었습니다." + e.getMessage());
        } catch ( ArithmeticException e ){
            System.err.println("0으로는 나눌 수 없습니다." + e.getMessage());
        } catch ( ArrayIndexOutOfBoundsException e ){
            System.err.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
        } catch (Exception e){ // 예상치 못한 예외나 명시하지 못한 예외를 잡는 마지막 방어선
            System.err.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
            if(sc != null){
                sc.close();
            }
        }
    }
}
