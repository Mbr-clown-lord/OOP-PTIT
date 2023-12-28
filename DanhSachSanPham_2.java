
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class SanPham implements Comparable<SanPham> {

    private String code, name, tbh, price;

    public SanPham(String code, String name, String price, String tbh) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.tbh = tbh;
    }

    public Integer getPrice() {
        return Integer.valueOf(price);
    }

    public String getCode() {
        return code;
    }

    @Override
    public int compareTo(SanPham other) {
        if (Objects.equals(this.getPrice(), other.getPrice())) {
            return this.code.compareTo(other.getCode());
        }
        return -this.getPrice().compareTo(other.getPrice());
    }

    @Override
    public String toString() {
        return code + " " + name + " " + price + " " + tbh;
    }
}

public class DanhSachSanPham_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("SANPHAM.in");
        Scanner sc = new Scanner(Obj);
        int n = sc.nextInt();
        sc.nextLine();
        SanPham[] a = new SanPham[n];
        for (int i = 0; i < n; i++) {
            a[i] = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
