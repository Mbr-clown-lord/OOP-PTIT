
import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon_1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();
            int len1 = s1.length(), len2 = s2.length();
            int len_max = Math.max(len1, len2);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            String tmp = a.subtract(b).abs().toString();
            int len3 = tmp.length();
            if (len3 == len_max) {
                System.out.println(tmp);
            } else {
                int cnt = len_max - len3;
                while (cnt-- > 0) {
                    tmp = '0' + tmp;
                }
                System.out.println(tmp);
            }
        }
    }
}
