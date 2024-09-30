package javatutorial.day07;

public class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(String color, String type, double width, double height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea(){
        System.out.println( "도형의 넓이 : "+ width * height );
    }

    public void shapeInfo(){
        System.out.println("=== Rectangle 도형의 정보 ===");
        System.out.println("도형의 색상 : " + getColor());
        calculateArea();
    }
}
