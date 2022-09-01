package lesson4;

public class Validator {
  public static final String MATCHER_REG_EX = "^\\w+$";

  public static boolean areLoginAndPasswordValid(String login,
                                                 String password,
                                                 String confirmPassword) {
    boolean conditionLogin = true;
    boolean conditionPassword = true;

    try {
      validateLogin(login);
      validatePassword(password, confirmPassword);
    } catch (WrongLoginException e) {
      conditionLogin = false;
      System.out.println(e.getMessage());
    } catch (WrongPasswordException e) {
      conditionPassword = false;
      System.out.println(e.getMessage());
    }
    return conditionLogin && conditionPassword;
  }

  private static void validateLogin(String login) throws WrongLoginException {
    if (login.length() > 20) {
      throw new WrongLoginException("Login length should be less than 20 character");
    } else if (!login.matches(MATCHER_REG_EX)) {
      throw new WrongLoginException("Login should contain latin letters, digits and _");
    }
  }

  private static void validatePassword(String password,
                                       String confirmPassword) throws WrongPasswordException {
    String matcherRegEx = "^\\w+$";
    if (password.length() > 20) {
      throw new WrongPasswordException("Password length should be less than 20 character");
    } else if (!password.matches(matcherRegEx)) {
      throw new WrongPasswordException("Password should contain latin letters, digits and _");
    } else if (!confirmPassword.equals(password)) {
      throw new WrongPasswordException("Confirm password should match origin password");
    }
  }
}
