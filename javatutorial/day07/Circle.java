package javatutorial.day07;

public class Circle extends Shape{
    private final double rarius;

    public Circle(String color, String type, double rarius) {
        super(color, type);
        this.rarius = rarius;
    }

    @Override
    public void calculateArea(){
        System.out.println( "도형의 넓이 : "+ rarius * rarius * Math.PI);
    }

    public void shapeInfo(){
        System.out.println("=== circle 도형의 정보 ===");
        System.out.println("도형의 색상 : " + getColor());
        calculateArea();
    }
}
