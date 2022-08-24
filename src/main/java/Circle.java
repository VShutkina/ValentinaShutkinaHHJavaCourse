import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки по оси х:");
        int a = scanner.nextInt();
        System.out.println("Введите координаты точки по оси y:");
        int b = scanner.nextInt();
        System.out.println("Введите радиус круга r:");
        int r = scanner.nextInt();
        System.out.println("Введите координаты центра круга по оси x:");
        int x = scanner.nextInt();
        System.out.println("Введите координаты центра круга по оси y:");
        int y = scanner.nextInt();
        isPointLocatedInsideCircle(x, y, r, a, b);
    }

    public static void isPointLocatedInsideCircle(int x, int y, int r, int a, int b) {
        if ((x - a) * (x - a) + (y - b) * (y - b) <= r * r) {
            System.out.println("Точка находится внутри круга");
        } else {
            System.out.println("Точка находится вне круга");
        }
    }
}
