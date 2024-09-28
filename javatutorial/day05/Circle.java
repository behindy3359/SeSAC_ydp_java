package javatutorial.day05;

public class Circle {
  final double radius;
  final double myPi = Math.PI;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calcArea(){
    return radius * radius * myPi;
  }
}
