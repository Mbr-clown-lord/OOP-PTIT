
import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println((a.multiply(b)).divide(a.gcd(b)));
        }
    }
}
