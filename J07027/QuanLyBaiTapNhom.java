package J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class SV implements Comparable<SV> {

    private String msv, name, sdt, stt, baitapnhom;

    public SV(String msv, String name, String sdt) {
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
    }

    public String getMsv() {
        return msv;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getStt() {
        return stt;
    }

    public void setBaitapnhom(String baitapnhom) {
        this.baitapnhom = baitapnhom;
    }

    public String getBaitapnhom() {
        return baitapnhom;
    }

    @Override
    public int compareTo(SV other) {
        return this.getMsv().compareTo(other.getMsv());
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + sdt + " " + stt +" "+ baitapnhom;
    }

}

class BT {

    private String baitapnhom;
    private int stt;

    public BT(String baitapnhom, int stt) {
        this.baitapnhom = baitapnhom;
        this.stt = stt;
    }

    public String getBaitapnhom() {
        return baitapnhom;
    }

    public Integer getStt() {
        return stt;
    }
}

class NH {

    private String msv, stt;

    public NH(String msv, String stt) {
        this.msv = msv;
        this.stt = stt;
    }

    public String getMsv() {
        return msv;
    }

    public String getStt() {
        return stt;
    }
}

public class QuanLyBaiTapNhom {

    public static void main(String[] args) throws FileNotFoundException {
        File sinhvien = new File("SINHVIEN.in");
        Scanner sc1 = new Scanner(sinhvien);
        ArrayList<SV> sv = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i++) {
            sv.add(new SV(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        File baitap = new File("BAITAP.in");
        Scanner sc2 = new Scanner(baitap);
        ArrayList<BT> bt = new ArrayList<>();
        int m = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < m; i++) {
            bt.add(new BT(sc2.nextLine(),i+1));
        }

        File nhom = new File("NHOM.in");
        Scanner sc3 = new Scanner(nhom);
        ArrayList<NH> nh = new ArrayList<>();
        while (sc3.hasNextLine()) {
            String[] s = sc3.nextLine().trim().split("\\s++");
            nh.add(new NH(s[0], s[1]));
        }

        for (SV x : sv) {
            for (NH y : nh) {
                if (x.getMsv().equals(y.getMsv())) {
                    x.setStt(y.getStt());
                    break;
                }
            }
        }
        for (SV x : sv) {
            for (BT y : bt) {
                if (Integer.valueOf(x.getStt()).equals(y.getStt())) {
                    x.setBaitapnhom(y.getBaitapnhom());
                    break;
                }
            }
        }
        Collections.sort(sv);
        for (SV x : sv) {
            System.out.println(x);
        }
    }
}
