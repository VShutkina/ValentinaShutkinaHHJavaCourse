import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class LessOneTest {

    private ChangeNumbers changeNumbers;
    private CheckNumbers checkNumbers;

    @BeforeAll
    public void setUp() {
        this.changeNumbers = new ChangeNumbers();
        this.checkNumbers = new CheckNumbers();
    }

    @Test
    public void checkExerciseOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String input = scanner.next();
        scanner.close();
        changeNumbers.swapDigits(input);
    }

    @Test
    public void checkExerciseTwo() {
        ArrayList<String> stringInputs = new ArrayList<>();
        for (int i = 100; i < 999; i++) {
            stringInputs.add(String.valueOf(i));
        }
        checkNumbers.checkNumber(stringInputs);
    }
}