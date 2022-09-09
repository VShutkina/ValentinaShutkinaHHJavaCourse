package lesson6;

import java.util.*;

public class Student {
  private final int LAST_COURSE = 5;
  private String firstName;
  private String lastName;
  private int course;
  private String group;
  private Map<Subject, Integer> gradesMap = new HashMap<>();

  public Student(String firstName, String lastName, int course) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
    this.group = "G" + course + "01";
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
        .toList();
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
        ", Оценки=" + gradesMap;
  }
}
