package javatutorial.day07;

public class mainClass1 {
    public static void main(String[] args) {
        Kim k = new Kim("김창식", "ABC고등학교", 17, 12345678, "피자","게임");
        Baek b = new Baek("백한울", "XYZ고등학교", 18, 87654321,"김밥","음악");
        k.studentInfo();
        b.studentInfo();

        Circle c = new Circle("red", "circle", 5.2);
        Rectangle r = new Rectangle("blue", "rectangle", 5, 2.5);

        c.shapeInfo();
        r.shapeInfo();
    }
}
