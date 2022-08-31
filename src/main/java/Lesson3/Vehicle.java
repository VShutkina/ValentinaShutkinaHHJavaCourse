package Lesson3;

public abstract class Vehicle implements Movable {
  private static int numberOfVehicle = 0;
  protected String registrationNumber = "";
  protected String model = "";
  protected String color = "";
  protected double speed = 0.0;

  protected Vehicle(String registrationNumber, String model, String color) {
    this.registrationNumber = registrationNumber;
    this.model = model;
    this.color = color;
    numberOfVehicle++;
  }

  public static int getNumberOfVehicle() {
    return numberOfVehicle;
  }

  @Override
  public void slowDown() {
    speed--;
  }

  @Override
  public void startMoving() {
    speed = 60.0;
  }

  @Override
  public double getSpeed() {
    return speed;
  }

  @Override
  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public abstract VehicleSize getSize();

}
