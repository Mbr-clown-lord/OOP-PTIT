package J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
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

class HP implements Comparable<HP> {

    public static int cnt = 1;
    private String manhom, mamon, tengv, ph;
    private int thu, kip;

    public HP(String mamon, int thu, int kip, String tengv, String ph) {
        this.manhom = String.format("HP%03d", cnt++);
        this.mamon = mamon;
        this.thu = thu;
        this.kip = kip;
        this.tengv = tengv;
        this.ph = ph;
    }

    public String getMamon() {
        return mamon;
    }

    public Integer getThu() {
        return thu;
    }

    public Integer getKip() {
        return kip;
    }

    public String getTengv() {
        return tengv;
    }

    @Override
    public int compareTo(HP other) {
        if (this.getThu().equals(other.getThu())) {
            if (this.getKip().equals(other.getKip())) {
                return this.getTengv().compareTo(other.getTengv());
            } else {
                return this.getKip().compareTo(other.getKip());
            }
        } else {
            return this.getThu().compareTo(other.getThu());
        }
    }

    @Override
    public String toString() {
        return manhom + " " + thu + " " + kip + " " + tengv + " " + ph;
    }
}

public class LichGiangDayTheoMonHoc {

    public static void main(String[] args) throws FileNotFoundException {
        File monhoc = new File("MONHOC.in");
        Scanner sc1 = new Scanner(monhoc);
        ArrayList<MH> mh = new ArrayList<>();
        int m = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < m; i++) {
            mh.add(new MH(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        File hocphan = new File("LICHGD.in");
        Scanner sc2 = new Scanner(hocphan);
        ArrayList<HP> hp = new ArrayList<>();
        int n = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < n; i++) {
            hp.add(new HP(sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()), sc2.nextLine(), sc2.nextLine()));
        }
        Collections.sort(hp);
        String s = sc2.nextLine();
        for (MH x : mh) {
            if (x.getMamon().equals(s)) {
                System.out.println("LICH GIANG DAY MON " + x.getTenmon() + ":");
                break;
            }
        }
        for (HP y : hp) {
            if (y.getMamon().equals(s)) {
                System.out.println(y);
            }
        }
    }
}
