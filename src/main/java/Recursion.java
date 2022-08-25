public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursion(1534));
    }

    public static String recursion(int n) {
        //базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } else {
            //рекурсия
            return recursion(n / 10) + " " + n % 10;
        }
    }
}
