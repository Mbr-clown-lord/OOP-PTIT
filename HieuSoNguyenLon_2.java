
import java.math.BigInteger;
import java.util.Scanner;


public class HieuSoNguyenLon_2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        if(a.compareTo(b)==0)
            System.out.println(0);
        else
            System.out.println(a.subtract(b));
    }
}
