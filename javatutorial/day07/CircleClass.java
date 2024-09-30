package javatutorial.day07;

public class CircleClass extends ShapeClass{

    //추상 클래스는 new
    public CircleClass(String color){super( color);}

    @Override
    void draw(){
        System.out.println("원 그리기!");
    }

}
