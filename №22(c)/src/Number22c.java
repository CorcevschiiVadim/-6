import java.util.Scanner;
public class Number22c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в фаренгйтах: ");
        double farenheit = in.nextDouble();
        double celsius = (farenheit * 5.0 / 9.0) - 32;
        System.out.printf("Градусы в цельсиях = " + "%.2f", celsius);

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите градусы в цельсиях: ");
        double celsius1 = in.nextDouble();
        double farenheit1 = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("Градусы в фаренгейтах = " + "%.2f", farenheit);

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите градусы в фаренгйтах: ");
        double farenhei2 = in.nextDouble();
        double celsius2 = (farenheit * 5.0 / 9.0) - 32;
        System.out.printf("Градусы в цельсиях = " + "%.2f", celsius);
    }
}
