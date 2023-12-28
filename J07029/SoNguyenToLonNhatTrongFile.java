package J07029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoNguyenToLonNhatTrongFile {

    public static boolean check(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i<=Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream np = new FileInputStream("DATA.in");
        ObjectInputStream is = new ObjectInputStream(np);
        TreeMap<Integer, Integer> ds = new TreeMap<>(Collections.reverseOrder());
        ArrayList<Integer> a = (ArrayList<Integer>) is.readObject();
        for (int i : a) {
            if (check(i)) {
                if (ds.containsKey(i)) {
                    ds.put(i, ds.get(i) + 1);
                } else {
                    ds.put(i, 1);
                }
            }
        }
        int cnt = 0;
        for (Integer i : ds.keySet()) {
            cnt++;
            System.out.println(i + " " + ds.get(i));
            if (cnt == 10) {
                break;
            }
        }
    }
}
