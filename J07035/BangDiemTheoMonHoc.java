package J07035;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class SV {
    
    private String msv, name, lop, email;
    private float diem;
    
    public SV(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    
    public String getLop() {
        return lop;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMsv() {
        return msv;
    }
}

class MH {
    
    private String mamon, tenmon, stc;
    
    public MH(String mamon, String tenmon, String stc) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.stc = stc;
    }
    
    public String getMamon() {
        return mamon;
    }
    
    public String getTenmon() {
        return tenmon;
    }
}

class BD implements Comparable<BD> {
    
    private String msv, mamon, tenmon, name, lop;
    private float diem;
    
    public BD(String msv, String mamon, float diem) {
        this.msv = msv;
        this.mamon = mamon;
        this.diem = diem;
    }
    
    public Float getDiem() {
        return diem;
    }
    
    public String getMsv() {
        return msv;
    }
    
    public String getMamon() {
        return mamon;
    }
    
    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }
    
    public String getTenmon() {
        return tenmon;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public static String ch(float diem) {
        if ((int) diem == diem) {
            return String.format("%.0f", diem);
        } else {
            return String.format("%.1f", diem);
        }
    }
    
    @Override
    public int compareTo(BD other) {
        if (this.getDiem().equals(other.getDiem())) {
            return this.getMsv().compareTo(other.getMsv());
        } else {
            return -this.getDiem().compareTo(other.getDiem());
        }
    }
    
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + ch(diem);
    }
}

public class BangDiemTheoMonHoc {
    
    public static String ch(String name) {
        String r = "";
        String[] a = name.toLowerCase().trim().split("\\s++");
        for (String i : a) {
            r += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return r.trim();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        File sinhvien = new File("C:\\Users\\NGUYEN VAN CANH\\SINHVIEN.in");
        Scanner sc1 = new Scanner(sinhvien);
        ArrayList<SV> sv = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i++) {
            sv.add(new SV(sc1.nextLine(), ch(sc1.nextLine()), sc1.nextLine(), sc1.nextLine()));
        }
        File monhoc = new File("C:\\Users\\NGUYEN VAN CANH\\MONHOC.in");
        Scanner sc2 = new Scanner(monhoc);
        ArrayList<MH> mh = new ArrayList<>();
        int m = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < m; i++) {
            mh.add(new MH(sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        File bangdiem = new File("C:\\Users\\NGUYEN VAN CANH\\BANGDIEM.in");
        Scanner sc3 = new Scanner(bangdiem);
        ArrayList<BD> bd = new ArrayList<>();
        int k = Integer.parseInt(sc3.nextLine());
        for (int i = 0; i < k; i++) {
            String[] s = sc3.nextLine().trim().split("\\s++");
            bd.add(new BD(s[0], s[1], Float.parseFloat(s[2])));
        }
        for (MH x : mh) {
            for (BD y : bd) {
                if (x.getMamon().equals(y.getMamon())) {
                    y.setTenmon(x.getTenmon());
                    break;
                }
            }
        }
        for (BD x : bd) {
            for (SV y : sv) {
                if (x.getMsv().equals(y.getMsv())) {
                    x.setLop(y.getLop());
                    x.setName(y.getName());
                }
            }
        }
        Collections.sort(bd);
        int q = Integer.parseInt(sc3.nextLine());
        for (int i = 0; i < q; i++) {
            String s = sc3.nextLine();
            for (MH x : mh) {
                if (x.getMamon().equals(s)) {
                    System.out.println("BANG DIEM MON " + x.getTenmon() + ":");
                    break;
                }
            }
            for (BD y : bd) {
                if (y.getMamon().equals(s)) {
                    System.out.println(y);
                }
            }
        }
    }
}
