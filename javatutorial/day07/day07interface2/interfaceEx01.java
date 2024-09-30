package javatutorial.day07.day07interface2;

public class interfaceEx01 {
    public static void main(String[] args) {
        Suv s = new Suv();

        s.powerOn();
        s.changeGear(1);
        s.moveFoward();
        s.changeGear(-1);
        s.moveBackward();
        s.powerOff();
    }
}
