
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChuanHoaXauHoTenTrongFile {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("C:\\Users\\NGUYEN VAN CANH\\DATA.in");
        Scanner sc = new Scanner(Obj);
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            a.add(sc.nextLine());
        }
        for (String x : a) {
            if ("END".equals(x)) {
                break;
            }
            String[] tmp = x.trim().split("\\s+");
            for (String i : tmp) {
                System.out.print(i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ");
            }
            System.out.println();
        }
    }
}
