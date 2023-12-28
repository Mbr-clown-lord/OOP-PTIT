
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class DN implements Comparable<DN> {

    private String ma, name, sl;

    public DN(String ma, String name, String sl) {
        this.ma = ma;
        this.name = name;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public int compareTo(DN other) {
        return this.ma.compareTo(other.getMa());
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + sl;
    }
}

public class DanhSachDoanhNghiep {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("DN.in");
        Scanner sc = new Scanner(Obj);
        int n = sc.nextInt();
        sc.nextLine();
        DN[] a = new DN[n];
        for (int i = 0; i < n; i++) {
            a[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
