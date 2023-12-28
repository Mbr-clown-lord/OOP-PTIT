
import java.util.Scanner;

public class TinhLuyThua {

    static Scanner sc = new Scanner(System.in);
    static final int MOD = 1000000007;

    public static long luythua(long a, long b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a % MOD;
        }
        long y = luythua(a, b / 2) % MOD;
        if (b % 2 == 0) {
            return (y * y) % MOD;
        } else {
            return (((y * y) % MOD) * a) % MOD;
        }
    }

    public static void main(String[] args) {
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(luythua(a, b));
        }
    }
}
