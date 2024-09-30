package javatutorial.day07;

public abstract class Shape {
    String color;
    String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    abstract void calculateArea();

    public String getColor() {
        return color;
    }
}

