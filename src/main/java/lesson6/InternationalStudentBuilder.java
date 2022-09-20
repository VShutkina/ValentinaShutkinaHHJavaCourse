package lesson6;

public class InternationalStudentBuilder extends StudentBuilder {
  private String type;

  public StudentBuilder withType() {
    this.type = String.valueOf(StudentType.INTERNATIONAL);
    return this;
  }

  @Override
  public Student build() {
    return new Student(firstName, lastName, course, type);
  }
}
