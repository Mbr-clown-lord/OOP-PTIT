package J07085;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Character.isDigit;
import java.util.ArrayList;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class TongChuSo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream is = new ObjectInputStream(file);
        ArrayList<String> a = (ArrayList<String>) is.readObject();
        for (String x : a) {
            String tmp = "";
            for (int i = 0; i < x.length(); i++) {
                if (isDigit(x.charAt(i))) {
                    tmp += x.charAt(i);
                }
            }
            while (tmp.startsWith("0")) {
                tmp = tmp.substring(1);
            }
            int sum = 0;
            for (int i = 0; i < tmp.length(); i++) {
                sum += tmp.charAt(i) - '0';
            }
            System.out.println(tmp + " " + sum);
        }
    }
}
