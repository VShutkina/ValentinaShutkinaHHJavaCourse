package lesson4;

import static lesson4.Validator.areLoginAndPasswordValid;

public class ExceptionsExercise {

  public static void main(String[] args) {
    if (areLoginAndPasswordValid("123", "1Я3", "1Я3")) {
      System.out.println("Логин и пароль валидны!");
    }
  }
}
