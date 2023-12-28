
import java.util.Scanner;

public class PTTSNT {

    public static Scanner ip = new Scanner(System.in);

    public static void testcase(int t) {
        int N = ip.nextInt();
        int n = N;
        System.out.printf("Test %d: ", t);
        for (int i = 2; i <= Math.sqrt(N); i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            if (cnt != 0) {
                System.out.printf("%d(%d) ", i, cnt);
            }
        }
        if (n != 1) {
            System.out.printf("%d(%d) ", n, 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = ip.nextInt();
        for (int i = 1; i <= t; i++) {
            testcase(i);
        }
    }
}