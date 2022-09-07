package lesson5;

import java.util.Scanner;

public class ExerciseThree {
  public static void main(String[] args) {
    CustomDoubleFunction discriminant = (a, b, c) -> b * 2 - 4 * a * c;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите значение a:");
    double a = scanner.nextDouble();
    System.out.println("Введите значение b:");
    double b = scanner.nextDouble();
    System.out.println("Введите значение c:");
    double c = scanner.nextDouble();

    System.out.println("Дискриминант равен: " + discriminant.calculate(a, b, c));

  }
}
