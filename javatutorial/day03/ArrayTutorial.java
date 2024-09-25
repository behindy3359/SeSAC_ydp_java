package javatutorial.day03;

//Data Type
//1. Prmitive Type
//1.1 정수 타입: byte, char, short, int, long
//1.2 실수 타입: float, double
//1.3 논리 타입: boolean
//int grade = 1;
//double scroe = 9.4;
//2. Reference Type
//: 객체 (object: 필드와 메서드로 구성된 덩어리) 의 번지를 참조하는 타입
//2.1 배열 타입
//2.2 열거 타입
//2.3 클래스
//2.4 인터페이스
//String name = "코딩온";
//String addr = "서울";
//---
//Stack & Heap
//Stack 영역
//- 변수는 모두 스택 영역에 생성됨
//- primitive type 직접 값을 저장, reference type은 힙 메모리 영역의 객체 번지수를 저장해서 번지수를 통해 객체를 참조
//Heap 영역
//- 참조 타입 변수가 힙 메모리 영역에 객체 저장

public class ArrayTutorial {
    public static void main(String[] args){

//        arraytest1();
//        intMatrix2();
//        intMatrix3();
        standardArray();
    }
    public static void arraytest1 (){
        int[] arr;
//        int arr2[];
        String[] temp = null;

        int [] intArray ={18, 23, 55, 100, 48};

        for(int i : intArray){
            System.out.printf("요소 : %d\n", i);
        }

        double[] doubleArray = new double[3];
        System.out.println(doubleArray[0]);
        doubleArray[0]=10;
        doubleArray[1]=10.5;
        doubleArray[2]=11;

        for(double i : doubleArray){
            System.out.printf("요소 : %.2f\n", i);
        }

        System.out.printf("길이 %d\n",doubleArray.length);

        double sum = 0;
        for(double i :doubleArray){
            sum += i ;
        }
        double avg = sum/doubleArray.length;

        System.out.println(sum);
        System.out.println(avg);
    }
    public static void intMatrix2 (){
        int[][] intMatrix = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] intMatrix2 = new int[3][2];

        intMatrix2[0][0]=1;
        intMatrix2[0][1]=2;
        intMatrix2[1][0]=3;
        intMatrix2[1][1]=4;
        intMatrix2[2][0]=5;
        intMatrix2[2][1]=6;

        for(int i = 0; i < 3 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                System.out.println("요소 : " + intMatrix2[i][j]);
            }
        }
    }
    public static void intMatrix3 (){
        int[][][] intMatrix3={{{1,2},{3,4}},{{5,6},{7,8}}};

        for(int f = 0; f < 2 ; f ++){
            for(int i = 0 ; i < 2 ; i ++){
                System.out.print("{");
                for(int j = 0 ; j < 2 ; j ++){
                    System.out.print(intMatrix3[f][i][j]);
                }
                System.out.print("}");
            }
        }
    }
    public static void standardArray (){

    }
}
