
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MatHang1 implements Comparable<MatHang1> {

    public static int cnt = 1;
    private String id, name, group, ln, giaban, giamua;

    public MatHang1(String name, String group, String giamua, String giaban) {
        this.id = String.format("%d", cnt++);
        this.name = name;
        this.group = group;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getLn() {
        ln = String.format("%.2f", Float.parseFloat(giaban) - Float.parseFloat(giamua));
        ln = ln.replace(',', '.');
        return ln;
    }

    @Override
    public int compareTo(MatHang1 other) {
        return -Float.valueOf(this.getLn()).compareTo(Float.valueOf(other.getLn()));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + getLn();
    }
}

public class SapXepDanhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang1> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String group = sc.nextLine();
            String giamua = sc.nextLine();
            String giaban = sc.nextLine();
            a.add(new MatHang1(name, group, giamua, giaban));
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }

}
