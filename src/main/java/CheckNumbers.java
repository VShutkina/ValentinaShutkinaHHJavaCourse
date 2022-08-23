import java.util.ArrayList;

public class CheckNumbers {

    public void checkNumber(ArrayList<Integer> numbers) {
        ArrayList<Integer> resArray = new ArrayList<>();
        for (Integer number : numbers) {
            if ((number % 10 == 0) && calculateOddDivisors(number) > 0 && (calculateOddDivisors(number) % 10) == 0) {
                resArray.add(number);
            }
        }
        System.out.println("Результат: " + resArray);
    }

    private int calculateOddDivisors(Integer integer) {
        int sumOfOddDivisors = 0;
        for (int i = 1; i < integer; i++) {
            if (integer % i == 0 && (i % 2) != 0) {
                sumOfOddDivisors = sumOfOddDivisors + i;
            }
        }
        return sumOfOddDivisors;
    }
}
