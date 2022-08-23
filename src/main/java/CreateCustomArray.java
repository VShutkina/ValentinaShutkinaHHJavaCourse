import static utils.ArrayHelper.addStringToArray;
import static utils.ArrayHelper.hasStringInArray;

public class CreateCustomArray {

    public String[] createStringCustomArray(String[] firstArray, String[] secondArray) {
        String[] result = new String[0];
        for (String value : firstArray) {
            if (!hasStringInArray(secondArray, value)) {
                if (!hasStringInArray(result, value)) {
                    result = addStringToArray(result, value);
                }
            }
        }
        return result;
    }
}
