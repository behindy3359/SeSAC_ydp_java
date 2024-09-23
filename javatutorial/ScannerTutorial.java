package javatutorial;

import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\n 이름을 입력해주세요 >>>> \n");
        String name = sc.next();

        System.out.printf("\n 나이을 입력해주세요 >>>> \n");
        int age = sc.nextInt();
        sc.close();

        System.out.printf("안녕하세요 \t %s님 ( %d세 )", name, age);
    }
}
