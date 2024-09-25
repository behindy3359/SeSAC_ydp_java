package javatutorial.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALTutorial {
    // ArrayList list 컬렉션 중 가장 많이 사용되는 녀석, 표준 배열보다는 느릴 수 있으나, 배열에 많은 동작이 필요할 때 유효
    // 동적 할당이 가능해서 크기를 미리 지정하지 않아도 괜찮음
    // list Collection 이니까 , reference type ===> 객체 자체를 저장하는 것이 아니라, 객체 주소를 저장하게

    //ArrayList 선언하는 3가지 방법
    // 1. List<E> list = new ArrayList<E>();
        // -> E 에 저장된 타입의 객체만 저장 가능
    // 2. Lise<E> list = new ArrayList<>();
        // -> E 에 지정된 타입의 객체만 저장 가능 (1번의 간소화된 문법으로, 컴파일러가 타입을 추론함)
    // 3. List list = new ArrayList();
        // -> 모든 타입의 객체 저장 ( 타입 안정성이 보장되지는 않음 )

    // 참고. 변수 타입 선언시 List, ArrayList 모두 사용 가능
    // - 같은 결과를 의미하지만, List 타입으로 ArrayList 를 생성하면 다형성을 이용하므로 유연함
    // ArrayList<E> list = new ArrayList<E>();

    public static void main(String[] args) {
        ArTutorial1();

        List<StudentClass> stdC = new ArrayList<>();

        stdC.add(new StudentClass("한성익",20));
        stdC.add(new StudentClass("김창식",30));
        stdC.add(new StudentClass("최한울",40));
        stdC.add(new StudentClass("이심복",50));
        stdC.add(new StudentClass("정만춘",60));

        stdC.remove(2);

//        System.out.println(stdC);
        for (StudentClass std : stdC){
            System.out.println(std);
        }
    }

    public static void ArTutorial1(){
        // 1. ArrayList 생성 (정수형 요소를 저장하는 ArrayList)
        List<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 3. 요소 접근
        System.out.println("첫번째 요소: " + numbers.get(0));
        System.out.println("세번째 요소: " + numbers.get(2));

        // 4. 요소 수정
        numbers.set(1, 77);
        System.out.println("numbers = " + numbers);
        System.out.println(Arrays.toString(numbers.toArray()));
        // Arrays.toString() 메서드는 "배열"을 인자로 받음.
        // 하지만, numbers 는 ArrayList 이므로 toArray() 를 이용해 배열로 변환 필요

        // 5. 요소 삽입
        numbers.add(1, 7);
        System.out.println("numbers = " + numbers);

        // 6. ArrayList 끼리 연결
        // System.out.println(Arrays.asList(99, 88, 77));
        // 참고. Arrays.asList(): 매개변수로 주어진 요소들을 고정 크기의 List 로 생성
        List<Integer> number2 = new ArrayList<>(Arrays.asList(99, 88, 77));
        System.out.println("number2 = " + number2);

        numbers.addAll(number2);
        System.out.println("numbers = " + numbers);

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(50));
        System.out.println(numbers.indexOf(89)); // 요소가 존재하지 않는다면 -1 반환

        // 8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers = " + numbers);

        // 9. 리스트 크기 확인
        System.out.println("리스트 크기: " + numbers.size());

        //10. 모든 요소 출력
        for(Integer n : numbers){
            System.out.println(n + " ");
        }

        //11 요소 포함 확인
        System.out.println(numbers.contains(4));

        //12. 모든 요소 삭제
        numbers.clear();
        System.out.println(numbers);
    }
}
class StudentClass {
    private String name;
    private int age;

    public StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Student{"+
                " name='"+ name+ '\'' +
                " , age=" + age + '}';
    }
}
