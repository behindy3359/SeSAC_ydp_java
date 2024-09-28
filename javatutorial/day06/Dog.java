package javatutorial.day06;

public class Dog extends Animal{
  public Dog(String species, String name, int age) {
    super(species, name, age);
  }

  @Override
  public void makeSound(){
    System.out.println("강아지는 멍멍!\n");
  }
}
