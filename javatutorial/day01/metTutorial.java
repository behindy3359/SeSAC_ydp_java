package javatutorial.day01;

import java.util.Scanner;

public class metTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n숫자 두개를 입력하세요! >>>");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        numberMatrix(num1, num2);

        System.out.println("\n원의 반지름을 입력하세요! >>>");
        float num5 = sc.nextFloat();
        area(num5);

        System.out.println("\n직사각형의 가로변의 길이를 입력하세요! >>>");
        float num6 = sc.nextFloat();
        System.out.println("\n직사각형의 세로변의 길이를 입력하세요! >>>");
        float num7 = sc.nextFloat();
        area(num6, num7);

        System.out.println("\n삼각형의 밑변의 길이를 입력하세요! >>>");
        double num8 = sc.nextDouble();
        System.out.println("\n삼각형의 높이의 길이를 입력하세요! >>>");
        double num9 = sc.nextDouble();
        area(num8, num9);

        sc.close();
    }

    public static void numberMatrix(float num1, float num2){
        System.out.printf("\n덧셈  결과 : %d",(int)(num1 + num2));
        System.out.printf("\n뺄셈  결과 : %d",(int)(num1 - num2));
        System.out.printf("\n곱셈  결과 : %d",(int)(num1 * num2));
        System.out.printf("\n나눗셈 결과 : %.3f",num1 / num2);
    }
    public static void area (float a){
        System.out.printf("\n반지름이 %.0f 인 원의 넓이 %f", a, a * a * Math.PI );
    }
    public static void area (float a, float b){
        System.out.printf("\n가로 %.0f, 세로 %.0f 인 직사각형의 넓이 %f", a, b, a * b);
    }
    public static void area (double a, double c){
        System.out.printf("\n밑변이 %.0f, 높이가 %.0f인 삼각형의 넓이 %.2f", a, c, (float)(a * c)/2);
    }
}
