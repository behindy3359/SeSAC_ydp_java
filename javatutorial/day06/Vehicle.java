package javatutorial.day06;

public class Vehicle {
  private String brand;
  private String model;
  private int year;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  private void startVehicle(){
    System.out.println("차량 시동을 걸었습니다.");
  }
  private void stopVehicle(){
    System.out.println("차량을 정지했습니다.\n");
  }

  public void vehicleInfo(){
    System.out.println("=== 차량 정보 ===");
    System.out.println("차량 정보를 출력합니다.");
  }

  public void driveVehicle(){
    System.out.println("차량이 운행합니다.");
  }

  public void operateVehicle(){
    vehicleInfo();
    startVehicle();
    driveVehicle();
    stopVehicle();
  }
}
