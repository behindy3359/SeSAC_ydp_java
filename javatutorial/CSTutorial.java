package javatutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요  >>>");
        int dataAge = sc.nextInt();

        if(0 < dataAge && dataAge <= 7){
            System.out.println("유아");
        } else if (7 < dataAge && dataAge <= 13) {
            System.out.println("초등학생");
        } else if (13 < dataAge && dataAge <= 16) {
            System.out.println("중학생");
        } else if (16 < dataAge && dataAge <= 19) {
            System.out.println("고등학생");
        }else {
            System.out.println("성인");
        }

        System.out.println("이름을 입력하세요  >>>");
        String dataName = sc.next();

        switch (dataName){
            case "홍길동":
                System.out.println("남자");
                break;
            case "성춘향":
                System.out.println("여자");
                break;
            default:
                System.out.println("모르겠어요 외계에서 오셨습니까");
                break;
        }

        List<Float> dataNums = new ArrayList<>();
        System.out.println("숫자를 입력하세요");

        System.out.print("첫번째 숫자 >>>>");
        dataNums.add(sc.nextFloat());
        System.out.println("두번째 숫자 >>>>");
        dataNums.add(sc.nextFloat());
        System.out.println("세번째 숫자 >>>>");
        dataNums.add(sc.nextFloat());

        //최댓값
        float maximun = 0;
        for( int i = 0 ; i < dataNums.size(); i++ ){
            if( dataNums.get(i) > maximun){
                maximun = dataNums.get(i);
            }
        }
        System.out.printf("\n최대값 >>> " + maximun);
        //최소값

        float minimun = 10000000;
        for( int i = 0 ; i < dataNums.size(); i++ ){
            if( dataNums.get(i) < minimun ){
                minimun = dataNums.get( i );
            }
        }
        System.out.printf("\n최소값 >>> " + minimun);

        //평균
        float sum = 0;
        float avg;
        for(float i : dataNums){
            sum = sum + i;
        }

        avg = sum/dataNums.size();

        System.out.printf("\n합계 %f \n평균 %.2f", sum , avg);

        System.out.println("\n숫자를 입력하세요");
        int endNum = sc.nextInt();

        for(int i = 1 ; i <= endNum ; i ++){
            System.out.printf("\t%d\t",i);
        }

        sc.close();
    }
}
