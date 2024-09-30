package javatutorial.day07;

public abstract class ShapeClass  {
    //필드 선언
    String color;

    public ShapeClass(String color) {
        this.color = color;
    }

    abstract void draw();

    void start(){
        System.out.println("도형을 그려보자");
    };
}
