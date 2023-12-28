
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MatHang implements Comparable<MatHang> {

    public static int cnt = 1;
    private String id, name, group, ln;
    private String priceban, pricemua;

    public MatHang(String name, String group, String pricemua, String priceban) {
        this.id = "MH" + String.format("%02d", cnt++);
        this.name = name;
        this.group = group;
        this.priceban = priceban;
        this.pricemua = pricemua;
    }

    public String getLn() {
        ln = String.format("%.2f ", Double.parseDouble(priceban) - Double.parseDouble(pricemua));
        ln = ln.replace(",", ".");
        return ln;
    }

    @Override
    public int compareTo(MatHang other) {
        return -Double.valueOf(this.getLn()).compareTo(Double.parseDouble(other.getLn()));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + getLn();
    }
}

public class SapXepMatHang {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("MATHANG.in");
        Scanner sc = new Scanner(Obj);
        int n = sc.nextInt();
        sc.nextLine();
        List<MatHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String group = sc.nextLine();
            String pricemua = sc.nextLine();
            String priceban = sc.nextLine();
            ds.add(new MatHang(name, group, pricemua, priceban));
        }
        Collections.sort(ds);
        for (int i = 0; i < n; i++) {
            System.out.println(ds.get(i));
        }
    }
}
