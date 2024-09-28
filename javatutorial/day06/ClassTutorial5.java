package javatutorial.day06;

public class ClassTutorial5 {
  public static void main(String[] args) {
    Animal a = new Animal( "동물 종", "동물 이름", 100);
    Cat cat = new Cat("고양이", "개냥이", 3);
    Dog dog = new Dog("강아지", "냥멍이", 5);

    a.makeSound();
    cat.makeSound();
    dog.makeSound();

    Bus bus = new Bus("hyundai", "City Bus", 2012, 20);
    Car car = new Car("Toyota", "Camry", 2023, true);
    Motorcycle motorcycle = new Motorcycle("Harley-Davidson","Sportster", 2021, 'A');

    bus.operateVehicle();
    car.operateVehicle();
    motorcycle.operateVehicle();
  }
}
