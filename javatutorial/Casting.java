package javatutorial;

public class Casting {
    public static void main(String[] args) {
        // 묵시적 형 변환 ( Wider conversion )
        // - 더 작은 타입에서 더 큰 타입으로의 자동 형변환
        // 반대의 경우에는 묵시적 형변환이 불가능 -> 명시적으로 변환해야 함
        int smallNumber = 10;
        double bigNumber = smallNumber;

        System.out.println("smallerNumber >>> " + smallNumber);
        System.out.println("bigNumber >>> " + bigNumber);

        /////////////////////////////////////////////////////
        // 명시적 형 변환 ( narrow conversion ) 데이터 손실이 발생할 수 있음을 알고 있어야함
        // - 더 큰 타입에서 작은 타입으로 형 변환

        double smallerNumber = 20.5;
        int biggerNumber = (int) smallerNumber;

        System.out.println("smallerNumber >>> " + smallerNumber);
        System.out.println("bigerNumber >>> " + biggerNumber);
    }
}
