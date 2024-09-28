package javatutorial.day06;

public class Motorcycle extends Vehicle{
  private char licenseType;

  public Motorcycle(String brand, String model, int year, char licenseType) {
    super(brand, model, year);
    this.licenseType = licenseType;
  }

  public char getLicenseType() {
    return licenseType;
  }

  @Override
  public void vehicleInfo(){
    System.out.println("=== Motorcycle 정보 ===");
    System.out.printf("Motorcycle { brand = '%s', model = '%s', year = %d, licenseType = %c } \n", getBrand(), getModel(), getYear(), getLicenseType());
  }

  @Override
  public void driveVehicle(){
    System.out.println("울림통을 합니다?");
  }
}
