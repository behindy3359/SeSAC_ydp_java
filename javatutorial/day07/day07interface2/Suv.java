package javatutorial.day07.day07interface2;

public class Suv implements Car{
    @Override
    public void changeGear(int gear) {
        System.out.println("기어 변경 : " + gear);
    }

    @Override
    public void moveFoward() {
        System.out.println("전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진");
    }

    @Override
    public void powerOn() {
        System.out.println("시동 켜기 : 부르르릉");
    }

    @Override
    public void powerOff() {
        System.out.println("시동 끄기 : 탈탈탈탈");
    }
}
