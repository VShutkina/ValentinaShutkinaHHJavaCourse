package lesson6;

public class StudentFactory {
  public Student createStudent(String firstName, String lastName, int course, StudentType type) {
    Student student;
    switch (type) {
      case REGULAR -> student = new RegularStudentBuilder()
          .withType()
          .withFirstName(firstName)
          .withLastName(lastName)
          .withCourse(course)
          .build();
      case INTERNATIONAL -> student = new InternationalStudentBuilder()
          .withType()
          .withFirstName(firstName)
          .withLastName(lastName)
          .withCourse(course)
          .build();
      default -> throw new IllegalStateException("Unexpected student type: " + type);
    }
    return student;
  }
}
