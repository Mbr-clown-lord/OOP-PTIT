
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {

    private String ma, loai, gia, phi;

    public LoaiPhong(String nextLine) {
        String[] a = nextLine.split("\\s");
        this.ma = a[0];
        this.loai = a[1];
        this.gia = a[2];
        this.phi = a[3];
    }

    public String getLoai() {
        return loai;
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.loai.compareTo(other.getLoai());
    }

    @Override
    public String toString() {
        return ma + " " + loai + " " + gia + " " + phi;
    }
}

public class Loai_Phong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }

}
