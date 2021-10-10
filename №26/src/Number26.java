import java.util.Scanner;
public class Number26 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        System.out.println("a = " + a + " b= " + b + " c= " + c + " d= " + d);
        a += d;
        b += c;
        d = a - d;
        c = b - c;
        a -= d;
        b -= c;
        System.out.println("a = " + a + " b = " + b + " c= " + c + " d= " + d);
    }
}
