package javatutorial.day01;

public class JavaOperatorTutorial {
    public static void main(String[] args) {
        int x, y;
        float a, b;

        x = 216;
        y = 7;
        a = 5.2f;
        b = 1.4f;

        System.out.println("==== x, y ====");
        // 산술 연산자!!
        System.out.println("x + y = " + ( x + y ));
        System.out.println("x - y = " + ( x - y ));
        System.out.println("x * y = " + ( x * y ));
        System.out.println("x / y = " + ( x / y ));
        System.out.println("x % y = " + ( x % y ));

        System.out.println("==== a, b ====");
        System.out.println("a + b = " + ( a + b ));
        System.out.println("a - b = " + ( a - b ));
        System.out.println("a * b = " + ( a * b ));
        System.out.println("a / b = " + ( a / b ));
        System.out.println("a % b = " + ( a % b ));

        x= 1;
        System.out.println("=== 증감연산자 ===");
        System.out.println("x++ = " + x++ + ' ' + x ); // 후위증가
        System.out.println("++x = " + ++x + ' ' + x ); // 전위증가
        System.out.println("x-- = " + x-- + ' ' + x ); // 후위증가
        System.out.println("--x = " + --x + ' ' + x ); // 전위증가

        System.out.println("== 산술대입연산자 ==");

        System.out.println("x : "+ x );
        System.out.println("x =+ 5 >> " + ( x =+ 5 ));
        System.out.println("x += 5 >> " + ( x += 5 ));
        System.out.println("x =- 5 >> " + ( x =- 5 ));
        System.out.println("x -= 5 >> " + ( x -= 5 ));
        System.out.println("x *= 5 >> " + ( x *= 5 ));
        System.out.println("x /= 5 >> " + ( x /= 5 ));
        System.out.println("x %= 5 >> " + ( x %= 5 ));

        System.out.println("=== 비교연산자 ===");
        System.out.println("a > b >> " + ( a > b ));
        System.out.println("a >= b >> " + ( a >= b ));
        System.out.println("a < b >> " + ( a < b ));
        System.out.println("a <= b >> " + ( a <= b ));
        System.out.println("a == b >> " + ( a == b ));
        System.out.println("a != b >> " + ( a != b ));

        boolean t = true;
        boolean f = false;
        boolean s = true;

        System.out.println("=== 논리연산자 ===");
        System.out.println("t && f >>" + (t && f));
        System.out.println("t && s >>" + (t && s));
        System.out.println("t || f >>" + (t || f));
        System.out.println("!s >>" + (!s));

        System.out.println("=== 삼항연산자 ===");
        System.out.println("x > y ? \"참\" : \"거짓\" >>>> " + ((x > y) ? "참" : "거짓"));

        // 연산자 우선순위
        // : 암묵적으로 연산자 우선 순위에 따라서 계산 , 명시적으로 연산 순서를 지정하고 싶다면, 괄호로 묶어서 우선 순위 지정 가능 !!


    }
}
