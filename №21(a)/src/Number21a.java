import java.util.Scanner;
public class Number21a {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int first = 0;
        int second = 0;
        double result = 0;
        String res = "";
        System.out.println("Вычисление частного");
        System.out.println("Введите делимое: ");
        first = scn.nextInt();
        System.out.println("Введите делитель: ");
        second = scn.nextInt();
        while (second == 0){
            System.out.println("Делитель не должен быть равен нулю!");
            System.out.println("Введите делитель: ");
            second = scn.nextInt();
            if (second > 0) break;
        }
        result = (double)first/second;
        res = result + "";
        if (result % 1 == 0){
            res = res.replace(".0", "");
        }
        System.out.print("/n");
        System.out.println(first + " : " + second + " = " + res);
    }
}
