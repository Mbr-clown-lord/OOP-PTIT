
import java.util.Scanner;

class Ps {

    private long tu, mau;

    public Ps(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public String Rutgon() {
        long ntc = gcd(tu, mau);
        tu = tu / ntc;
        mau = mau / ntc;
        return tu + "/" + mau;
    }

    @Override
    public String toString() {
        return Rutgon();
    }
}

public class PhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        Ps Obj = new Ps(tu, mau);
        System.out.println(Obj);
    }
}
