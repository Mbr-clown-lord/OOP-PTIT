package J07072;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class PP implements Comparable<PP> {

    private String name, ten, ho, tendem;

    public PP(String name) {
        String r = "";
        String[] a = name.toLowerCase().trim().split("\\s++");
        this.ho = a[0];
        this.ten = a[a.length - 1];
        this.tendem = a[1];
        for (String i : a) {
            r += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        this.name = r.trim();
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getTendem() {
        return tendem;
    }

    @Override
    public int compareTo(PP other) {
        if (this.getTen().compareTo(other.getTen()) == 0) {
            if (this.getHo().compareTo(other.getHo()) == 0) {
                return this.getTendem().compareTo(other.getTendem());
            } else {
                return this.getHo().compareTo(other.getHo());
            }
        } else {
            return this.getTen().compareTo(other.getTen());
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ChuanHoaVaSapXep {

    public static void main(String[] args) throws FileNotFoundException {
        File danhsach = new File("DANHSACH.in");
        Scanner sc = new Scanner(danhsach);
        ArrayList<PP> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            ds.add(new PP(sc.nextLine()));
        }
        Collections.sort(ds);
        for (PP i : ds) {
            System.out.println(i);
        }
    }
}
