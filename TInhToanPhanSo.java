
import java.util.Scanner;

class Ps {

    private long tu, mau;

    public Ps() {
        tu = 0;
        mau = 0;
    }

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
        Ps bt = new Ps();
        Ps tps = new Ps();
        long x = this.tu, y = this.mau;
        //tinh binh phuong tong hai phan so
        this.tu = this.tu * b.mau + b.tu * this.mau;
        this.mau = this.mau * b.mau;
        bt.tu = this.tu * this.tu;
        bt.mau = this.mau * this.mau;
        long ntc1 = gcd(bt.tu, bt.mau);
        bt.tu = bt.tu / ntc1;
        bt.mau = bt.mau / ntc1;
        // tinh tich 3 phan so
        tps.tu = x * b.tu * bt.tu;
        tps.mau = y * b.mau * bt.mau;
        long ntc2 = gcd(tps.tu, tps.mau);
        tps.tu = tps.tu / ntc2;
        tps.mau = tps.mau / ntc2;
        // tra lai ket qua
        String result = bt.tu + "/" + bt.mau + " " + tps.tu + "/" + tps.mau;
        return result;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class TInhToanPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long tu = sc.nextLong();
            long mau = sc.nextLong();
            Ps a = new Ps(tu, mau);
            tu = sc.nextLong();
            mau = sc.nextLong();
            Ps b = new Ps(tu, mau);
            System.out.println(a.tongps(b));
        }
    }
}
