package javatutorial.day06;

public class Car extends Vehicle{
  private boolean convertible;

  public Car(String brand, String model, int year, boolean convertible) {
    super(brand, model, year);
    this.convertible = convertible;
  }

  public boolean getConvertible() {
    return convertible;
  }

  @Override
  public void vehicleInfo(){
    System.out.println("=== CAR 정보 ===");
    System.out.printf("CAR { brand = '%s', model = '%s', year = %d, convertible = %b } \n", getBrand(), getModel(), getYear(), getConvertible());
  }

  @Override
  public void driveVehicle(){
    System.out.println("주차했습니다.");
  }
}
