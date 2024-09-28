package javatutorial.day06;

public class Cat extends Animal{

  public Cat(String species, String name, int age) {
    super(species, name, age);
  }

  @Override
  public void makeSound(){
    System.out.println("고양이는 야옹!\n");
  }
}
