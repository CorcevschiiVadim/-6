import java.util.Scanner;
public class circleArea {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("Введите радиус: ");

            double radius = sc.nextDouble();
            double area = Math.PI * (radius * radius);
            System.out.println("Площадь круга равна: " + area);
        }
}
