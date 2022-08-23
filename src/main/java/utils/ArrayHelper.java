package utils;

public class ArrayHelper {

    public static String[] addStringToArray(String[] initialArray, String newValue) {
        String[] newArray = new String[initialArray.length + 1];
        System.arraycopy(initialArray, 0, newArray, 0, initialArray.length);
        newArray[newArray.length - 1] = newValue;
        return newArray;
    }

    public static boolean hasStringInArray(String[] arrayToCheck, String value) {
        boolean res = false;
        for (String s : arrayToCheck) {
            if (s.equals(value)) {
                res = true;
                break;
            }
        }
        return res;
    }
}
