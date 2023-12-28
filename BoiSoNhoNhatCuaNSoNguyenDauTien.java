
import java.util.Scanner;

public class BoiSoNhoNhatCuaNSoNguyenDauTien {

    static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long boiso(long n) {
        long lcm = 1;
        for (int i = 1; i <= n; i++) {
            lcm = (lcm * i) / gcd(lcm, i);
        }
        return lcm;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(boiso(n));
        }
    }
}
