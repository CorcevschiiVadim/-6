import java.util.Scanner;
public class Number21b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, d, s;
        a = in.nextInt();
        b = a % 10;
        d = a / 10 % 10;
        s = a / 100;
        System.out.println(b + " " + d + " " + s + " " + (a * 100 + d * 10 + s));
    }
}
