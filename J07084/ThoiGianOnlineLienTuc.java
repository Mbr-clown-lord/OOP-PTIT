package J07084;

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
class SV implements Comparable<SV> {

    private String name, batdau, ketthuc;
    private int phut;

    public SV(String name, String batdau, String ketthuc) throws ParseException {
        this.name = name;
        this.batdau = batdau;
        this.ketthuc = ketthuc;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date x = sdf.parse(batdau);
        Date y = sdf.parse(ketthuc);
        this.phut = (int)((y.getTime() - x.getTime()) /1000/60);
    }

    public String getName() {
        return name;
    }

    public int getPhut() {
        return phut;
    }

    @Override
    public int compareTo(SV other) {
        if (this.getPhut() == other.getPhut()) {
            return this.getName().compareTo(other.getName());
        }
        return other.getPhut() - this.getPhut();
    }

    @Override
    public String toString() {
        return name + " " + phut;
    }
}

public class ThoiGianOnlineLienTuc {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File online = new File("C:\\Users\\NGUYEN VAN CANH\\ONLINE.in");
        Scanner sc = new Scanner(online);
        ArrayList<SV> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ds.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for (SV x : ds) {
            System.out.println(x);
        }
    }
}
