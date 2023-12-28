package J07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class KH implements Comparable<KH> {

    public static int cnt = 1;
    private int ngay, thang, nam;
    private String id, name, gt, ns, dc;

    public KH(String name, String gt, String ns, String dc) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.id = String.format("KH%03d", cnt++);
        Date x = sdf.parse(ns);
        String y = sdf.format(x);
        this.name = name;
        this.gt = gt;
        this.ns = y;
        this.dc = dc;
        //22/09/2003
        this.nam = Integer.parseInt(y.substring(6));
        this.thang = Integer.parseInt(y.substring(3, 5));
        this.ngay = Integer.parseInt(y.substring(0, 2));
    }

    public Integer getNam() {
        return nam;
    }

    public Integer getThang() {
        return thang;
    }

    public Integer getNgay() {
        return ngay;
    }

    @Override
    public int compareTo(KH other) {
        if (this.getNam().compareTo(other.getNam()) == 0) {
            if (this.getThang().compareTo(other.getThang()) == 0) {
                return this.getNgay().compareTo(other.getNgay());
            } else {
                return this.getThang().compareTo(other.getThang());
            }
        } else {
            return this.getNam().compareTo(other.getNam());
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gt + " " + dc + " " + ns;
    }
}

public class DanhSachKhachHangTrongFile {

    public static String ch(String name) {
        String r = "";
        String[] a = name.toLowerCase().trim().split("\\s++");
        for (String i : a) {
            r += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return r.trim();
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File kh = new File("C:\\Users\\NGUYEN VAN CANH\\KHACHHANG.in");
        Scanner sc = new Scanner(kh);
        sc.nextLine();
        ArrayList<KH> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            ds.add(new KH(ch(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for (KH x : ds) {
            System.out.println(x);
        }
    }
}
