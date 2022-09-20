package lesson6;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
  private final int LAST_COURSE = 5;
  private String firstName;
  private String lastName;
  private int course;
  private String group;
  private String type = "NO TYPE";
  private Map<Subject, Integer> gradesMap = new HashMap<>();

  public Student(String firstName, String lastName, int course) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
    this.group = "G" + course + "01";
  }

  public Student(String firstName, String lastName, int course, String type) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
    this.group = "G" + course + "01";
    this.type = type;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getCourse() {
    return course;
  }

  public void increaseCourse() {
    if (course + 1 <= LAST_COURSE) {
      course++;
    }
  }

  public void updateGroup() {
    group = "G" + getCourse() + "01";
  }

  public void setGradeForSubject() {
    List<Subject> subjects = getLearningSubjects();
    for (Subject subject : subjects) {
      gradesMap.put(subject, new Random().nextInt(4) + 1);
    }
  }

  private List<Subject> getLearningSubjects() {
    return Arrays.stream(Subject.values()).
        filter(t -> t.getCourse() == course)
        .collect(Collectors.toList());
  }

  public double getAverageGrade() {
    return gradesMap.values().stream().mapToDouble(i -> i).average().orElse(0.0);
  }

  public boolean isGraduated() {
    return course == LAST_COURSE;
  }

  @Override
  public String toString() {
    return "Студент:" +
        " Имя=" + firstName +
        ", Фамилия=" + lastName +
        ", Курс=" + course +
        ", Группа=" + group +
        ", Тип студента=" + type +
        ", Оценки=" + gradesMap;
  }
}
