
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class MatHang implements Comparable<MatHang> {

    public static int cnt = 1;
    private String id, name, dv;
    private Integer pricemua, priceban, ln;

    public MatHang(String name, String dv, Integer pricemua, Integer priceban) {
        this.id = "MH0" + String.format("%02d", cnt++);
        this.name = name;
        this.dv = dv;
        this.pricemua = pricemua;
        this.priceban = priceban;
    }

    public String getId() {
        return id;
    }

    public Integer getLn() {
        return priceban - pricemua;
    }

    @Override
    public int compareTo(MatHang other) {
        if (Objects.equals(this.getLn(), other.getLn())) {
            return this.getId().compareTo(other.getId());
        }
        return -this.getLn().compareTo(other.getLn());
    }
    @Override
    public String toString(){
        return id+" "+name+" "+dv+" "+pricemua.toString()+" "+priceban.toString()+" "+getLn();
    }
}

public class DanhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang[] a = new MatHang[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dv = sc.nextLine();
            Integer pricemua = sc.nextInt();
            Integer priceban = sc.nextInt();
            sc.nextLine();
            a[i] = new MatHang(name, dv, pricemua, priceban);
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
