package Lesson3;

public class Truck extends Vehicle {
  private int truckLoad = 0;

  public Truck(String registrationNumber, String model, String color) {
    super(registrationNumber, model, color);
  }

  public int getTruckLoad() {
    return truckLoad;
  }

  public void setTruckLoad(int truckLoad) {
    this.truckLoad = truckLoad;
  }

  @Override
  public VehicleSize getSize() {
    if (truckLoad >= 4000) {
      return VehicleSize.LARGE;
    } else {
      return VehicleSize.MEDIUM;
    }
  }

  @Override
  public void speedUp() {
    speed = speed + 20;
  }

  @Override
  public void slowDown() {
    speed = speed - 15;
  }
}
