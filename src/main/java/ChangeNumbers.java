public class ChangeNumbers {
    public void swapDigits(String number) {
        System.out.println("Было введено: " + number);
        if (!number.matches(Constants.NUMBER_REGEX) || number.length() != 3 || number.charAt(0) == '-') {
            System.out.println("Введено неверное значение");
        } else {
            String res = replaceCharsInString(number);
            System.out.println("А вот и ответ: " + res);
        }
    }

    private String replaceCharsInString(String number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (Integer.parseInt(number) > 500) {
            stringBuilder
                    .append(number)
                    .reverse();
        } else {
            stringBuilder
                    .append(number.substring(1))
                    .reverse()
                    .insert(0, number.charAt(0));
        }
        return stringBuilder.toString();
    }
}
