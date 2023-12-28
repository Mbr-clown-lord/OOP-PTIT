
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

    public String tongps(Ps b) {
        this.tu = this.tu * b.mau + b.tu * this.mau;
        this.mau = this.mau * b.mau;
        long ntc = gcd(this.tu, this.mau);
        this.tu = this.tu / ntc;
        this.mau = this.mau / ntc;
        return this.tu + "/" + this.mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class TongPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        Ps a = new Ps(tu, mau);
        tu = sc.nextLong();
        mau = sc.nextLong();
        Ps b = new Ps(tu, mau);
        System.out.println(a.tongps(b));
    }
}
