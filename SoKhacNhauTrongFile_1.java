
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SoKhacNhauTrongFile_1 {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("C:\\Users\\NGUYEN VAN CANH\\DATA.in");
        Scanner sc = new Scanner(Obj);
        int[] d = new int[1001];
        while (sc.hasNext()) {
            d[sc.nextInt()]++;
        }
        for (int i = 0; i < d.length; i++) {
            if (d[i] != 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
