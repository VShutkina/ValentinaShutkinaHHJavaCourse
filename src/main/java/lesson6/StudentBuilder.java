package lesson6;

public class StudentBuilder {
  protected String firstName;
  protected String lastName;
  protected int course;

  public static StudentBuilder aStudent() {
    return new StudentBuilder();
  }

  public StudentBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public StudentBuilder withLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public StudentBuilder withCourse(int course) {
    this.course = course;
    return this;
  }

  public Student build() {
    return new Student(firstName, lastName, course);
  }
}
