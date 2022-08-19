import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class CheckNumbers {

    public void checkNumber(ArrayList<String> numbers) {
        ArrayList<String> resArray = new ArrayList<>();
        for (String str : numbers) {
            if (str.matches(Constants.NUMBER_REGEX) && str.length() == 3 && str.charAt(0) != '-') {
                if (str.endsWith("0") && calculateOddDivisors(str) > 0 && (calculateOddDivisors(str) % 10) == 0) {
                    resArray.add(str);
                }
            }
        }
        System.out.println("Результат: " + resArray);
    }

    private int calculateOddDivisors(String number) {
        int integer = parseInt(number);
        int sumOfOddDivisors = 0;
        for (int i = 1; i < integer; i++) {
            if (integer % i == 0 && (i % 2) != 0) {
                sumOfOddDivisors = sumOfOddDivisors + i;
            }
        }
        return sumOfOddDivisors;
    }
}
