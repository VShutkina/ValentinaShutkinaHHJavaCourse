package lesson6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Deanery deanery = new Deanery();
    deanery.addStudentsToDeanery(
        new Student("Ivan", "Ivanov", 1),
        new Student("Petr", "Petrov", 1),
        new Student("Olga", "Ivanova", 1),
        new Student("Kirill", "Petrov", 2),
        new Student("Andrey", "Petrov", 2),
        new Student("Anton", "Petrov", 5),
        new Student("Antonina", "Petrova", 4),
        new Student("Anton", "Antonov", 2));

    System.out.println("Выводим список студентов до сессии:");
    deanery.printStudents();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Вывести всех студентов с курса. Введите курс (от 1 до 5):");
    int input = scanner.nextInt();
    if (input <= 5) {
      System.out.println("Список студентов, обучающихся на " + input + " курсе:");
      deanery.printStudentsByCourse(deanery.getStudents(), input);
    } else {
      System.out.println("Такого курса не существует!");
    }

    System.out.println("Проставить оценки по итогам сессии");
    deanery.doExam();
    System.out.println("Выводим список студентов после сессии:");
    deanery.printStudents();
    System.out.println();
    System.out.println("Перевести студентов на следующий курс или отчислить за неуспеваемость:");
    deanery.makeStudentAssessment();
  }
}
