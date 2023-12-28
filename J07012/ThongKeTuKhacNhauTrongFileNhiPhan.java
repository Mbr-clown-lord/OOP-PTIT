package J07012;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
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

public class ThongKeTuKhacNhauTrongFileNhiPhan {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream vb = new FileInputStream("DATA.in");
        ObjectInputStream is=new ObjectInputStream(vb);
        TreeMap<String, Integer> tm = new TreeMap<>();
        ArrayList<VB> ds = new ArrayList<>();
        ArrayList<String> a=(ArrayList<String>) is.readObject();
         for(String i:a){
            String[] x = i.toLowerCase().trim().split("\\W\\s*");
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
