package lesson6;

public enum Subject {
  JAVA_CORE(2),
  MATCH(1),
  HISTORY(1),
  ENGLISH(2),
  IT(3),
  MANAGEMENT(5),
  QA(4);

  private int course;

  Subject(int course) {
    this.course = course;
  }

  public int getCourse() {
    return course;
  }
}
