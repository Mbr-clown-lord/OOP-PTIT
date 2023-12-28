
import java.util.Scanner;

class NhanVien {

    private final String ma = "NV01";
    private String ten, chucvu;
    private int luongcung, ngaycong;

    public NhanVien(String ten, String chucvu, int ngaycong, int luongcung) {
        this.ten = ten;
        this.chucvu = chucvu;
        this.luongcung = luongcung;
        this.ngaycong = ngaycong;
    }

    public int Luong() {
        return ngaycong * luongcung;
    }

    public int Thuong() {
        if (ngaycong > 22 && ngaycong < 25) {
            return (int) (Luong() * 0.1);
        } else if (ngaycong > 24) {
            return (int) (Luong() * 0.2);
        } else {
            return 0;
        }
    }

    public int Phucap() {
        if ("GD".equals(chucvu)) {
            return 250000;
        } else if ("PGD".equals(chucvu)) {
            return 200000;
        } else if ("TP".equals(chucvu)) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public int Thunhap() {
        return Luong() + Thuong() + Phucap();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", ma, ten, Luong(), Thuong(), Phucap(), Thunhap());
    }
}

public class BaiToanTinhCong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongcung = sc.nextInt();
        int ngaycong = sc.nextInt();
        sc.nextLine();
        String chucvu = sc.nextLine();
        NhanVien Obj = new NhanVien(ten, chucvu, ngaycong, luongcung);
        System.out.println(Obj);
    }
}
