package J07073;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class MH implements Comparable<MH> {

    private String id, name, stc, lt, th;

    public MH(String id, String name, String stc, String lt, String th) {
        this.id = id;
        this.name = name;
        this.stc = stc;
        this.lt = lt;
        this.th = th;
    }

    public String getId() {
        return id;
    }

    public String getTh() {
        return th;
    }

    @Override
    public int compareTo(MH other) {
        return this.getId().compareTo(other.getId());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stc + " " + lt + " " + th;        
    }
}

public class DangKyHinhThucGiangDay {

    public static void main(String[] args) throws FileNotFoundException {
        File monhoc = new File("MONHOC.in");
        Scanner sc = new Scanner(monhoc);
        ArrayList<MH> ds = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            ds.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for (MH x : ds) {
            String tmp = x.getTh();
            String duoi = tmp.substring(tmp.length() - 2);
            if (tmp.equals("Truc tuyen") || duoi.equals("vn")) {
                System.out.println(x);
            }
        }
    }
}
