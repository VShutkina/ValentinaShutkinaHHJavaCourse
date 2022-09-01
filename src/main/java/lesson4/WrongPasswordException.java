package lesson4;

public class WrongPasswordException extends Exception {
  public WrongPasswordException(String message) {
    super("Invalid password: " + message);
  }
}
