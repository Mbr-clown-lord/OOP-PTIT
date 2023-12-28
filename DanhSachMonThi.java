
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonThi {

    private String info;

    public MonThi(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}

public class DanhSachMonThi {

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("C:\\Users\\NGUYEN VAN CANH\\MONHOC.in");
        Scanner sc = new Scanner(Obj);
        ArrayList<String> a = new ArrayList<>();
        int cnt = 0;
        String s = "";
        boolean isFirstLine = true;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }
            cnt++;
            s += line + " ";
            if (cnt == 3) {
                a.add(s);
                cnt = 0;
                s = "";
            }
        }
        Collections.sort(a);
        for (String i : a) {
            MonThi MT=new MonThi(i);
            System.out.println(MT);
        }
    }
}
