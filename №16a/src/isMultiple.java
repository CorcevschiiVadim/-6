import java.util.Scanner;
public class isMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("True");
        else
            if (number % 2 != 0)
            System.out.println("False");
    }
}
