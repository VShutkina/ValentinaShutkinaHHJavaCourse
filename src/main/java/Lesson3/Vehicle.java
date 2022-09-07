package Lesson3;

public abstract class Vehicle implements Movable {
  private static int numberOfVehicle = 0;
  protected double maxFuelTankVolume = 0.0;
  protected double maxSpeedValue = 90;
  protected String registrationNumber = "";
  protected String model = "";
  protected String color = "";
  protected double speed = 0.0;
  protected double tankCurrentVolume = 0.0;

  protected Vehicle(String registrationNumber, String model, String color, double tankMaxVolume, double maxSpeedValue) {
    this.registrationNumber = registrationNumber;
    this.model = model;
    this.color = color;
    this.maxFuelTankVolume = tankMaxVolume;
    this.maxSpeedValue = maxSpeedValue;
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

  public double getTankCurrentVolume() {
    return tankCurrentVolume;
  }

  public void setTankCurrentVolume(double newTankCurrentVolume) {
    if (tankCurrentVolume + newTankCurrentVolume <= maxFuelTankVolume) {
      System.out.println("Заправляем бак на " + newTankCurrentVolume + " л топлива");
      tankCurrentVolume = tankCurrentVolume + newTankCurrentVolume;
    } else {
      System.out.println("Не удалось заправить бак на " + newTankCurrentVolume + " л топлива! Проверь объем бака");
    }
  }

}
