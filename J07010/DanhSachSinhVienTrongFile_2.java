package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class SinhVien {

    public static int cnt = 1;
    private String msv, name, dob, lop;
    private double gpa;

    public SinhVien(String name, String dob, String lop, double gpa) {
        this.msv = "B20DCCN0" + String.format("%02d", cnt++);
        this.name = name;
        this.dob = dob;
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class DanhSachSinhVienTrongFile_2 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File sinhvien = new File("SV.in");
        Scanner sc = new Scanner(sinhvien);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            Date x = sdf.parse(sc.nextLine());
            String dob = sdf.format(x);
            double gpa = Double.parseDouble(sc.nextLine());
            ds.add(new SinhVien(name, dob, lop, gpa));
        }
        for (SinhVien x : ds) {
            System.out.println(x);
        }
    }
}
