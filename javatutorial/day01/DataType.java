package javatutorial.day01;

public class DataType {

    public static void main(String[] args) {

        System.out.println("primitive type");

        int x = 10; // 32bit
        long y = 10000000000000L; // 64bit long type 은 L 또는 l 이 붙어야함
        short z = 1414; // 16bit
        byte b = 122; // 8bit

        float a = 3.14F; // 32bit float type 은 F 또는 f 가 붙어야함
        double c = 2.615123; // 64bit

        char ch = 'T'; // 작은따옴표 사용

        boolean bool = true;

        System.out.println("정수형 변수 " + x + ", " + y + ", " + z + ", " + b);
        System.out.println("실수형 변수 " + a + ", " + c);
        System.out.println("문자형 변수 " + ch);
        System.out.println("논리형 변수 " + bool);

        //java 에서의 String type 은 특별하게 다뤄짐 -> 참조형이지만 기본형처럼 사용됨, 엄연하게는 참조형임
        String greeting = "hello world!";

        int[] numbers = {1,2,3,4,5};

        Person person = new Person("john" , 30);

        System.out.println("String 변수 : " + greeting );
        System.out.println("배열 변수 : " +  numbers );

        for(int i = 0 ; i <numbers.length; i ++){
            System.out.println(numbers[i]);
        }

        System.out.println("Person 객체 " +person.getName() + ", " + person.getAge() );
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

