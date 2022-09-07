package Lesson3;

public class CheckerImpl<T extends Vehicle> implements Checker<T> {

  @Override
  public void checkFuelTankVolume(T vehicle, double currentVolume) {
    if (currentVolume < vehicle.maxFuelTankVolume) {
      System.out.println("В баке ещё есть место для " + (vehicle.maxFuelTankVolume - currentVolume) + " л топлива");
    } else {
      System.out.println("Бак заполнен!");
    }
  }

  @Override
  public void checkSpeed(T vehicle, double currentSpeed) {
    if (currentSpeed < vehicle.maxSpeedValue) {
      System.out.println("Скорость не превышает " + vehicle.maxSpeedValue + ". Можно ехать.");
    } else {
      System.out.println("Скорость превышает " + vehicle.maxSpeedValue + ". Снижайте скорость!");
    }
  }
}
