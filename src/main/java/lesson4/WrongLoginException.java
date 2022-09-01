package lesson4;

public class WrongLoginException extends Exception {
  public WrongLoginException(String message) {
    super("Invalid login: " + message);
  }
}
