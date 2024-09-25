package javatutorial.day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTutorials {
    // 예외 - 일반 예외 ( 컴파일러가 예외 처리 코드 여부를 검사 하는 예외, 코드를 작성하는 시점에서 개발자가 예외 처리를 해줘야함, 그렇지않으면 컴파일에러 발생, )
    //     - 실행 예외 ( Runtime Exception, 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외, 예외를 처리하는 것이 권장됨 )

    // 자바는 예외처리가 발생하면 예외 클래스로부터 객체가 생성하며, 해당 객체는 예외 처리시 사용됨
    // 예외 발생 시 프로그램의 갑작스런 종료를 막고 정상실행할 수 있도록 처리하는 코드를 "예외처리코드"라고 하며, try-catch-finally 블록으로 구성됨

    // 다중 catch 블록 가능 : 여러 가지 유형의 예외를 동시에 처리할 수 있음
    public static void main(String[] args) {
        try {

//            System.out.println( "연산 시작!!" );
//            divide(6,0 );
//            int[] numbers ={ 10, 20, 30, 40, 50 };
//            System.out.println(getValueByIdx(numbers,numbers.length));
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력해주세요 >>");
            int number = sc.nextInt();
            System.out.println("입력한 정수는 다음과 같습니다 >>" + number);

            sc.close();
        } catch (ArithmeticException e){
            System.err.println( "divide 실행시 예외가 발생함 \n" + e.getMessage() );
            System.err.println( e.toString() );
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println( "배열 인덱싱 중 에러 발생" );
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println( "정수가 아닌 값이 입력되었습니다." );
            e.printStackTrace();
        } finally {
            System.out.println( "연산 종료!!" );
        }
    }
    public  static  String divide(int x, int y){ return x + " / "+ y + " = " + (x/y);}
    public  static  int getLength(String str){ return str.length(); }
    public  static  int getValueByIdx(int[] arr, int idx){ return arr[idx];}
}
