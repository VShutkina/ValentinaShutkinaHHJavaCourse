package Lesson3;

public class Main {
  public static void main(String[] args) {

    Car car = new Car("DGF 786", "Lada Granta", "white");
    System.out.println("Добавить пассажиров");
    car.setPassengers(1);
    car.setPassengers(3);
    System.out.println("В машине " + car.getPassengers() + " пассажиров");
    System.out.println("Добавляем людей больше, чем вмещает машина");
    car.setPassengers(3);
    System.out.println("Начать движение");
    car.startMoving();
    System.out.println("Текущая скорость " + car.getSpeed());
    System.out.println("Ускоряемся");
    car.speedUp();
    System.out.println("Текущая скорость " + car.getSpeed());
    System.out.println("Слишком быстро, едем медленнее");
    car.slowDown();
    System.out.println("Текущая скорость " + car.getSpeed());

    System.out.println("Общее количество машин: " + Vehicle.getNumberOfVehicle());

    Truck truck = new Truck("FGF 345", "Ford focus", "black");
    System.out.println("Загрузить машину");
    truck.setTruckLoad(2000);
    System.out.println("Трак загружен на " + truck.getTruckLoad() + "кг");
    System.out.println("Размер трака: " + truck.getSize());
    System.out.println("Стартуем движение");
    truck.startMoving();
    truck.setSpeed(80);
    System.out.println("Текущая скорость " + car.getSpeed());


    System.out.println("Общее количество машин: " + Vehicle.getNumberOfVehicle());


  }
}
