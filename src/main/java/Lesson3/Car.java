package Lesson3;

public class Car extends Vehicle {

  private static final int PASS_CAPACITY = 4;
  private int passengers = 0;

  public Car(String registrationNumber, String model, String color) {
    super(registrationNumber, model, color, 80.0, 120);
  }

  public int getPassengers() {
    return passengers;
  }

  public void setPassengers(int newPassengers) {
    if (passengers + newPassengers <= PASS_CAPACITY) {
      System.out.println("К имеющимся " + passengers + " пассажиру(ам) - посадили еще " + newPassengers + " пассажир(ов)");
      passengers = passengers + newPassengers;
      System.out.println("Итого в машине: " + passengers + " человек");
    } else {
      System.out.println("Невозможно посадить больше людей в машину! Можно посадить еще " + (PASS_CAPACITY - passengers));
    }
  }

  @Override
  public VehicleSize getSize() {
    return VehicleSize.MEDIUM;
  }

  @Override
  public void speedUp() {
    speed = speed + 30;
  }

  @Override
  public void slowDown() {
    speed = speed - 10;
  }
}
