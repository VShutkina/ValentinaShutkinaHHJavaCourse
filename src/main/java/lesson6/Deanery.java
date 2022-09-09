package lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deanery {
  private List<Student> students = new ArrayList<>();

  public void addStudentsToDeanery(Student... students) {
    Collections.addAll(this.students, students);
  }

  public void printStudents() {
    students.forEach(System.out::println);
  }

  public void printStudentsByCourse(List<Student> students, int course) {
    ArrayList<Student> resultList = new ArrayList<>();
    students.stream().filter(s -> s.getCourse() == course).forEach(s -> {
      resultList.add(s);
      System.out.println(s.getFirstName() + " " + s.getLastName());
    });
    if (resultList.isEmpty()) {
      System.out.println("Нет студентов на данном курсе!");
    }
  }

  public List<Student> getStudents() {
    return students;
  }

  public void doExam() {
    students.forEach(Student::setGradeForSubject);
  }

  public void makeStudentAssessment() {
    Iterator<Student> iterator = students.iterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      if (student.getAverageGrade() < 3) {
        System.out.println("Студент " + student.getFirstName() + " " + student.getLastName() + " со средним баллом "
            + student.getAverageGrade() + " будет отчислен");
        iterator.remove();
      } else if (student.getAverageGrade() >= 3 && !student.isGraduated()) {
        System.out.println("Студент " + student.getFirstName() + " " + student.getLastName() + " со средним баллом "
            + student.getAverageGrade() + " переведен на следующий курс");
        student.increaseCourse();
      } else {
        System.out.println("Студент " + student.getFirstName() + " " + student.getLastName() + " со средним баллом "
            + student.getAverageGrade() + " выпускник");
        iterator.remove();
      }
    }
  }
}
