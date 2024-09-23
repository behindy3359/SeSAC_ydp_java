package javatutorial;

import java.util.Scanner;

public class IOwithScanner {
    public static void main(String[] args) {
//        int amount = 3;
//        String product = " (칼로리가 0이 아닌) 제로 콜라";
//        System.out.printf("편의점에서 %s 제품을 %d 개 구매 했습니다." , product, amount);
//
//        // %s : 문자열
//        // %d : 정수형
//        // %f : 실수형
//        // %c : 문자형
//        // %b : 논리형 , boolean
//        // %n : 줄바꿈!
//
//        String dataS = "가난다라마바사아";
//        int dataI = 1;
//        float dataF = 124151.555F;
//        char dataC = 'F';
//        boolean dataB = true;
//
//        System.out.printf(" %n 문자열 %s%n 정수형 %d%n 실수형 %f%n 문자형 %c%n 논리형 %b%n ", dataS, dataI, dataF, dataC, dataB);
//        System.out.printf("%%%n%%%n%%%n");
//        System.out.print("1무척이나 긴 내용을 쓰겠읍니다. 읍니다. 라떼는 말입니다.");
//        System.out.println("1무척이나 긴 내용을 쓰겠읍니다. 읍니다. 라떼는 말입니다.");
//        System.out.print("1무척이나 긴 내용을 쓰겠읍니다. 읍니다. 라떼는 말입니다.");
//        System.out.print("1무척이나 긴 내용을 쓰겠읍니다. 읍니다. 라떼는 말입니다.");
//        System.out.print("1무척이나 긴 내용을 쓰겠읍니다. 읍니다. 라떼는 말입니다.");
//        System.out.println("1무척이나 긴 내용을 쓰겠읍니다. 읍니다. 라떼는 말입니다.");

        System.out.println("공백으로 구분하여 이름/나이/키/결혼 여부를 입력해주세요 >>");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        double heignt = sc.nextDouble();
        boolean merriage = sc.nextBoolean();

        System.out.println("====== 입력 결과 출력하기 ======");
        System.out.printf("이름 \t\t\t : %s  (님) \n", name);
        System.out.printf("나이 \t\t\t : %d  (세) \n", age);
        System.out.printf("신장 \t\t\t : %.1f (cm) \n", heignt);
        System.out.printf("결혼 \t\t\t : %b \n", merriage);

        sc.close();
    }
}
