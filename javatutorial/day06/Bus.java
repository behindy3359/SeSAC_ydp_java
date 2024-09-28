package javatutorial.day06;

public class Bus extends Vehicle{
  private int passengerCapacity;

  public Bus(String brand, String model, int year, int passengerCapacity) {
    super(brand, model, year);
    this.passengerCapacity = passengerCapacity;
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  @Override
  public void vehicleInfo(){
    System.out.println("=== BUS 정보 ===");
    System.out.printf("BUS { brand = '%s', model = '%s', year = %d, passengerCapacity = %d }\n", getBrand(), getModel(), getYear(), getPassengerCapacity());
  }

  @Override
  public void driveVehicle(){
    System.out.println("승객을 운송합니다.");
  }
}
