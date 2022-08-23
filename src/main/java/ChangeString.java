public class ChangeString {
    public void swapChars(String string) {
        System.out.println("Было введено: " + string);
        if (!string.matches(Constants.NUMBER_REGEX) || string.length() != 3 || string.charAt(0) == '-') {
            System.out.println("Введено неверное значение");
        } else {
            String res = replaceCharsInString(string);
            System.out.println("А вот и ответ: " + res);
        }
    }

    private String replaceCharsInString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (Integer.parseInt(string) > 500) {
            stringBuilder
                    .append(string)
                    .reverse();
        } else {
            stringBuilder
                    .append(string.substring(1))
                    .reverse()
                    .insert(0, string.charAt(0));
        }
        return stringBuilder.toString();
    }
}
