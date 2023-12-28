package J07011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author NGUYEN VAN CANH
 */
class VB implements Comparable<VB> {

    private String s;
    private int lanxh;

    public VB(String s, int lanxh) {
        this.s = s;
        this.lanxh = lanxh;
    }

    public String getS() {
        return s;
    }

    public Integer getLanxh() {
        return lanxh;
    }

    @Override
    public int compareTo(VB other) {
        if (this.getLanxh().equals(other.getLanxh())) {
            return this.getS().compareTo(other.getS());
        } else {
            return -this.getLanxh().compareTo(other.getLanxh());
        }
    }

    @Override
    public String toString() {
        return s + " " + lanxh;
    }
}

public class ThongKeTuKhacNhauTrongFileVanBan {

    public static void main(String[] args) throws FileNotFoundException {
        File vb = new File("C:\\Users\\NGUYEN VAN CANH\\VANBAN.in");
        Scanner sc = new Scanner(vb);
        TreeMap<String, Integer> tm = new TreeMap<>();
        ArrayList<VB> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] x = sc.nextLine().toLowerCase().trim().split("\\W\\s*");
            for (String j : x) {
                if (!j.equals("")) {
                    if (tm.containsKey(j)) {
                        tm.put(j, tm.get(j) + 1);
                    } else {
                        tm.put(j, 1);
                    }
                }
            }
        }
        for (String i : tm.keySet()) {
            ds.add(new VB(i, tm.get(i)));
        }
        Collections.sort(ds);
        for (VB i : ds) {
            System.out.println(i);
        }
    }

}
