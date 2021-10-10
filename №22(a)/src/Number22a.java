import java.util.Scanner;
public class Number22a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в фаренгйтах: ");
        double farenheit = in.nextDouble();
        double celsius = (farenheit * 5.0 / 9.0) - 32;
        System.out.printf("Градусы в цельсиях = " + "%.2f", celsius);
    }
}
