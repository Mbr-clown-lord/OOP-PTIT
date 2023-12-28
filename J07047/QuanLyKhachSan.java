package J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/*
 * @author NGUYEN VAN CANH
 */
class KH implements Comparable<KH> {

    public static int cnt = 1;
    private String id, name, maphong, ngayden, ngaydi, loaiphong;
    private double phaitra, phiphucvu, giamgia, dongia;
    private long luutru;

    public KH(String name, String maphong, String ngayden, String ngaydi) throws ParseException {
        this.id = String.format("KH%02d", cnt++);
        this.name = name;
        this.maphong = maphong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        this.loaiphong = maphong.substring(2, 3);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date nden = sdf.parse(ngayden);
        Date ndi = sdf.parse(ngaydi);
        if (ngayden.equals(ngaydi)) {
            this.luutru = 1;
        } else {
            this.luutru = (ndi.getTime() - nden.getTime()) / (1000L * 60 * 60 * 24);
        }
        if (luutru < 10) {
            this.giamgia = 0.0;
        } else if (luutru >= 10 && luutru < 20) {
            this.giamgia = 0.02;
        } else if (luutru >= 20 && luutru < 30) {
            this.giamgia = 0.04;
        } else {
            this.giamgia = 0.06;
        }
    }

    public void setPhiphucvu(double phiphucvu) {
        this.phiphucvu = phiphucvu;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void setPhaitra() {
        double tien = luutru * dongia;
        double ppv = tien * phiphucvu;
        double gg = tien * giamgia;
        this.phaitra = (double) (tien + ppv) * (1 - giamgia);
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public Long getLuutru() {
        return luutru;
    }

    @Override
    public int compareTo(KH other) {
        return -this.getLuutru().compareTo(other.getLuutru());
    }

    @Override
    public String toString() {
        if (luutru == 1) {
            this.luutru = 0;
        }
        return id + " " + name + " " + maphong + " " + luutru + " " + String.format("%.2f", phaitra);
    }
}

class LP {

    private String loaiphong, tenloaiphong;
    private double phiphucvu, dongia;

    public LP(String loaiphong, String tenloaiphong, double dongia, double phiphucvu) {
        this.loaiphong = loaiphong;
        this.tenloaiphong = tenloaiphong;
        this.dongia = dongia;
        this.phiphucvu = phiphucvu;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public double getDongia() {
        return dongia;
    }

    public double getPhiphucvu() {
        return phiphucvu;
    }
}

public class QuanLyKhachSan {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File khachhang = new File("C:\\Users\\NGUYEN VAN CANH\\DATA.in");
        Scanner sc = new Scanner(khachhang);
        ArrayList<KH> kh = new ArrayList<>();
        ArrayList<LP> lp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().trim().split("\\s++");
            lp.add(new LP(s[0], s[1], Long.parseLong(s[2]), Double.parseDouble(s[3])));
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            kh.add(new KH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (KH x : kh) {
            for (LP y : lp) {
                if (x.getLoaiphong().equals(y.getLoaiphong())) {
                    x.setDongia(y.getDongia());
                    x.setPhiphucvu(y.getPhiphucvu());
                    x.setPhaitra();
                    break;
                }
            }
        }
        Collections.sort(kh);
        for (KH x : kh) {
            System.out.println(x);
        }
    }
}
