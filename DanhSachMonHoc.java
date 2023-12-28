
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class MonHoc implements Comparable<MonHoc> {

    private String mamon, name, tc;

    public MonHoc(String mamon, String name, String tc) {
        this.mamon = mamon;
        this.name = name;
        this.tc = tc;
    }

    public String getMamon() {
        return mamon;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(MonHoc other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public String toString() {
        return mamon + " " + name + " " + tc;
    }
}

public class DanhSachMonHoc {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("MONHOC.in");
        Scanner sc = new Scanner(Obj);
        int n = sc.nextInt();
        sc.nextLine();
        MonHoc[] a = new MonHoc[n];
        for (int i = 0; i < n; i++) {
            a[i] = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
