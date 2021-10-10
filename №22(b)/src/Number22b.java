import java.util.Scanner;
public class Number22b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в цельсиях: ");
        double celsius = in.nextDouble();
        double farenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("Градусы в фаренгейтах = " + "%.2f", farenheit);
    }
}
