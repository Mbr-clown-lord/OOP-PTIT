
import java.util.Scanner;

public class BoBaSoPytago {

    static Scanner sc = new Scanner(System.in);
    static int n, k = 3;
    static int[] a = new int[5001];
    static int[] b = new int[5001];
    static boolean ok;

    public static boolean check(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }

    public static void Try(int i) {
        for (int j = b[i - 1] + 1; j <= n - k + i; j++) {
            b[i] = j;
            if (i == k) {
                if (check(a[b[1]], a[b[2]], a[b[3]])) {
                    ok = true;
                    break;
                }
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            b[0] = 0;
            ok = false;
            Try(1);
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
