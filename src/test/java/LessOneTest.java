import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class LessOneTest {

    private ChangeString changeString;
    private CheckNumbers checkNumbers;
    private CreateCustomArray createCustomArray;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @BeforeAll
    public void setUp() {
        this.changeString = new ChangeString();
        this.checkNumbers = new CheckNumbers();
        this.createCustomArray = new CreateCustomArray();
    }

    @Test
    public void checkExerciseOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String input = scanner.next();
        scanner.close();
        changeString.swapChars(input);
    }

    @Test
    public void checkExerciseTwo() {
        ArrayList<Integer> inputs = new ArrayList<>();
        for (int i = 100; i < 999; i++) {
            inputs.add(i);
        }
        checkNumbers.checkNumber(inputs);
    }

    @Test
    public void checkExerciseThree() {
        Scanner scanner = new Scanner(System.in);
        double totalWeight = 0.0;
        int personsTotal = 0;

        boolean isRunnable = true;

        while (isRunnable) {
            System.out.println("Вес вошедшего человека (число в формате xxx, xxx.xx):");
            String weight = scanner.next();

            System.out.println("К имеющимся " + totalWeight + " кг нагрузки - добавилось " + weight + " кг");
            totalWeight += Double.parseDouble(weight);
            personsTotal += 1;
            isRunnable = !((totalWeight >= Constants.ALARM_WEIGHT) || (personsTotal >= Constants.ALARM_PERSONS_COUNT));
        }

        System.out.println("Итого в лифте: " + personsTotal + " человек с весом " + df.format(totalWeight) + " кг");
        if (totalWeight >= Constants.ALARM_WEIGHT) {
            System.out.println("Ошибка: превышена допустимая нагрузка!");
        } else if (personsTotal == 6) {
            System.out.println("Ошибка: превышено количество людей внури!");
        }
    }

    @Test
    public void checkExerciseFour() {
        String[] firstArray = {"7483", "3262", "9182", "4738"};
        String[] secondArray = {"11", "3262", "45"};
        String[] resultArray = createCustomArray.createStringCustomArray(firstArray, secondArray);
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : resultArray) {
            stringBuilder.append(str + " ");
        }
        System.out.println(stringBuilder);
    }
}