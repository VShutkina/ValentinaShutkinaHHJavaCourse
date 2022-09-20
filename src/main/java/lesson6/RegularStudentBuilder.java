package lesson6;

public class RegularStudentBuilder extends StudentBuilder {

  private String type;

  public StudentBuilder withType() {
    this.type = String.valueOf(StudentType.REGULAR);
    return this;
  }

  @Override
  public Student build() {
    return new Student(firstName, lastName, course, type);
  }
}
