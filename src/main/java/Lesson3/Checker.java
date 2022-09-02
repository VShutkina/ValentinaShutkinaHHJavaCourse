package Lesson3;

public interface Checker<T> {
  void checkFuelTankVolume(T vehicle, double currentVolume);

  void checkSpeed(T vehicle, double currentSpeed);
}
