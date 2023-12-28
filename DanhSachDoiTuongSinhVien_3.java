
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class SinhVien3 implements Comparable<SinhVien3>{

    public static int cnt = 0;
    private String id, name, lop, ns;
    private double gpa;

    public SinhVien3() {
        id = "";
        name = "";
        lop = "";
        ns = "";
        gpa = 0f;
    }

    public SinhVien3(String name, String lop, String ns, double gpa) {
        cnt++;
        if (cnt < 10) {
            this.id = "B20DCCN0" + String.format("%02d", cnt);
        } else {
            this.id = "B20DCCN0" + String.format("%01d", cnt);
        }
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public String getGpa() {
        return String.format("%.2f", gpa);
    }
    @Override
    public int compareTo(SinhVien3 other){
        return -this.getGpa().compareTo(other.getGpa());
    }
    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + ns + " " + getGpa();
    }
}

public class DanhSachDoiTuongSinhVien_3 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<SinhVien3> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String[] b = ten.trim().split("\\s++");
            String name="";
            for (String x : b) {
                name += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
            String lop = sc.nextLine();
            String x = sc.nextLine();
            Date y = sdf.parse(x);
            String ns = sdf.format(y);
            double gpa = sc.nextDouble();
            a.add(new SinhVien3(name, lop, ns, gpa));
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
