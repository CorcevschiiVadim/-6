import java.util.Scanner;
public class displayDigits {
    public static int digits1(int[] arr, int num) {
        int n = 0, d = 0, k = num;
        do {
            d = (n == 0) ? 1 : d * 10;
            ++n;
        } while ((k /= 10) != 0);

        for (int i = 0; i < n; ++i, d /= 10) {
            arr[i] = num / d % 10;
            if (arr[i] < 0)
                arr[i] = -arr[i];
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        int cnt = digits1(arr, Integer.MIN_VALUE);
        for (int i = 0; i < cnt; ++i)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        cnt = digits1(arr, Integer.MAX_VALUE);
        for (int i = 0; i < cnt; ++i)
            System.out.printf("%d ", arr[i]);
    }
}
