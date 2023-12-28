
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang> {

    public static int mk = 1;
    private String id, name, mp;
    private Long luutru;

    public KhachHang(String name, String mp, Long luutru) {
        this.id = "KH" + String.format("%02d", mk++);
        this.name = name;
        this.mp = mp;
        this.luutru = luutru;
    }

    public Long getLuutru() {
        return luutru;
    }

    @Override
    public int compareTo(KhachHang other) {
        return -this.luutru.compareTo(other.getLuutru());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + mp + " " + luutru;
    }
}

public class DanhSachLuuTru {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = sc.nextInt();
        sc.nextLine();
        List<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String mp = sc.nextLine();
            Date startDay = sdf.parse(sc.nextLine());
            Date lastDay = sdf.parse(sc.nextLine());
            Long luutru = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24);
            ds.add(new KhachHang(name, mp, luutru));
        }
        Collections.sort(ds);
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i));
        }
    }
}
