  package javatutorial.day05;

  public class Rectangle3 {
    //필드 접근제어자를 private로 변경
    private double width;
    private double height;

    public static int count = 0;

    public Rectangle3(double width) {
      this.width = width;
      count ++;
    }

    // width와 height 필드에 대한 getter, setter 생성
    public double getWidth() {
      return width;
    }

    public void setWidth(double width) {
      this.width = width;
    }

    public double getHeight() {
      return height;
    }

    public void setHeight(double height) {
      this.height = height;
    }

    public double area(){
      return width * height;
    }
  }
