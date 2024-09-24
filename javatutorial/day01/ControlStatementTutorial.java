package javatutorial.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlStatementTutorial {
    public static void main(String[] args) {

        int number = 10;

        if(number % 2 == 0 ){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }

        ///////////////////////////////////
        System.out.println("이름을 입력해주세요 >>");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("name 값 확인 : " + name);

//        // BAD ('==' 비교연산자의 잘못된 사용)
//        if(name=="김새싹"){
//            System.out.println("환영합니다.");
//        }else{
//            System.out.println("이름을 다시 확인해주세요");
//        }

        //Good ( .equals() 메서드 사용)
        if(name.equals("김새싹")){
            System.out.println("환영합니다.");
        }else{
            System.out.println("이름을 다시 확인해주세요");
        }

        sc.close();
        String str1 = "hello";
        String str2 = "hello";

        if(str1 == str2){
            System.out.println("같은 참조를 가르킵니다.");
        }else{
            System.out.println("다른 참조를 가르킵니다.");
        }

        if(str1.equals(str2)){
            System.out.println("내용이 같 다.");
        }else{
            System.out.println("내용이 다르다.");
        }

        String str3 = new String("bye");
        String str4 = new String("bye");

        if(str3 == str4){
            System.out.println("같은 참조를 가르킵니다.");
        }else{
            System.out.println("다른 참조를 가르킵니다.");
        }

        if(str3.equals(str4)){
            System.out.println("내용이 같 다.");
        }else{
            System.out.println("내용이 다르다.");
        }

        number = 10;

        if( number % 3 == 0 ){
            System.out.println("3의 배수");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수");
        } else if (number % 2 == 0) {
            System.out.println("2의 배수");
        }else {
            System.out.println("3의 배수도, 5의 배수도, 2의 배수도 아니다.");
        }

        String datOfWeek;
        int day = 4;
        switch ( day ){
            case 1:
                datOfWeek = "일";
                break;
            case 2:
                datOfWeek = "월";
                break;
            case 3:
                datOfWeek = "화";
                break;
            case 4:
                datOfWeek = "수";
                break;
            case 5:
                datOfWeek = "목";
                break;
            case 6:
                datOfWeek = "금";
                break;
            case 7:
                datOfWeek = "토";
                break;
            default:
                datOfWeek="타당하지 않은 입력";
                 break;
        }
        System.out.println("daxy of Week"+ datOfWeek);

        for(int i = 1 ; i <= 10; i ++){
            System.out.println("*");
        }
        for(int i = 1 ; i <= 10; i ++){
            System.out.println("*");
        }

        int dw= 1;
        do{
            System.out.println(dw + " dw ");
            dw++;
        }while (dw<=10);

        int cw = 1;
        while (cw<10){
            System.out.println(dw + " dw ");
            cw++;
        }

        String[] array = {"a", "b", "c"};
        for(String a : array){
            System.out.println( "원소 = " + a);
        }

        for(int x = 0 ; x < array.length ; x++){
            String a = array[x];
            System.out.println("원소 = " + a);
        }

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("E");
        for(String i : list ){
            System.out.println("i = " + i)  ;
        }
    }
}
