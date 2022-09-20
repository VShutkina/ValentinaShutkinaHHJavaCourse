package lesson6;

import java.util.Scanner;

import static lesson6.StudentType.INTERNATIONAL;
import static lesson6.StudentType.REGULAR;

public class Main {
  public static void main(String[] args) {
    StudentFactory studentFactory = new StudentFactory();
    Deanery deanery = new Deanery();
    deanery.addStudentsToDeanery(
        StudentBuilder.aStudent().withFirstName("Ivan").withLastName("Ivanov").withCourse(1).build(),
        StudentBuilder.aStudent().withFirstName("Petr").withLastName("Petrov").withCourse(1).build(),
        StudentBuilder.aStudent().withFirstName("Olga").withLastName("Ivanova").withCourse(1).build(),
        StudentBuilder.aStudent().withFirstName("Kirill").withLastName("Petrov").withCourse(2).build(),
        StudentBuilder.aStudent().withFirstName("Andrey").withLastName("Petrov").withCourse(2).build(),
        StudentBuilder.aStudent().withFirstName("Anton").withLastName("Petrov").withCourse(5).build(),
        StudentBuilder.aStudent().withFirstName("Antonina").withLastName("Petrova").withCourse(4).build(),
        StudentBuilder.aStudent().withFirstName("Anton").withLastName("Antonov").withCourse(2).build(),
        studentFactory.createStudent("John", "Doe", 3, INTERNATIONAL),
        studentFactory.createStudent("Anna", "Ivanova", 3, REGULAR));
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

    System.out.println();
    System.out.println("Проставить оценки по итогам сессии");
    deanery.doExam();
    System.out.println("Выводим список студентов после сессии:");
    deanery.printStudents();
    System.out.println();
    System.out.println("Перевести студентов на следующий курс или отчислить за неуспеваемость:");
    deanery.makeStudentAssessment();
    System.out.println();
    System.out.println("Список студентов, перешедших на следующий год:");
    deanery.printStudents();
  }
}
