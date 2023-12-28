
package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class LoaiBoSoNguyen {

    public static boolean isInteger(String s) {
        try {
            Integer valueOf = Integer.valueOf(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("DATA.in");
        Scanner sc = new Scanner(data);
        ArrayList<String> ds = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (!isInteger(s)) {
                ds.add(s);
            }
        }
        Collections.sort(ds);
        for (String x : ds) {
            System.out.print(x+" ");
        }
    }
}
