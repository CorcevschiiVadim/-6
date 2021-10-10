import java.util.Scanner;
public class Number29 {
    public static void main(String[] args) {
        int hCount = 0;
        int tCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько монету нужно подбросить? ");
        int coinsCount = input.nextInt();
        for (int i = 0; i < coinsCount; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
                hCount++;
            } else {
                System.out.println("Tails");
                tCount++;
            }
        }
        System.out.println("Heads: "+hCount+", Tails: "+tCount);
    }
}
