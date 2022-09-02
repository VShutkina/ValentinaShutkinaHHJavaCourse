package lesson5;

import java.util.Scanner;

public class ExerciseTwo {
  public static void main(String[] args) {
    CustomIntPredicate predicate = number -> number % 13 == 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите целое число:");
    int input = scanner.nextInt();

    if (predicate.checkInt(input)) {
      System.out.println("Переданное число делится без остатка на 13");
    } else {
      System.out.println("Переданное число не делится без остатка на 13");
    }
  }
}
