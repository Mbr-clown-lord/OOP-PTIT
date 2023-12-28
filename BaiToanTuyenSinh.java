
import java.util.Scanner;

class ThiSinh {

    private String ma, ten;
    private double toan, ly, hoa;

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemuutien() {
        String khuvuc = ma.substring(0, 3);
        if ("KV1".equals(khuvuc)) {
            return 0.5f;
        } else if ("KV2".equals(khuvuc)) {
            return 1.f;
        } else {
            return 2.5f;
        }
    }

    public double tongdiem() {
        return toan * 2.0 + ly + hoa;
    }

    public String ketqua() {
        if (tongdiem() + diemuutien() >= 24.f) {
            return "TRUNG TUYEN";
        } else {
            return "TRUOT";
        }
    }

    public String fomatString(double x) {
        int xInt = (int) (x * 10);
        if (xInt % 10 == 0) {
            return String.format("%.0f", x);
        } else {
            return String.format("%.1f", x);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", ma, ten, fomatString(diemuutien()), fomatString(tongdiem()), ketqua());
    }
}

public class BaiToanTuyenSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        ThiSinh Obj = new ThiSinh(ma, ten, toan, ly, hoa);
        System.out.println(Obj);
    }
}
