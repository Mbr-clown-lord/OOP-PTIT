package J07030;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class CapSoNguyenToTrongFile1 {

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file1 = new FileInputStream("DATA1.in");
        ObjectInputStream is1 = new ObjectInputStream(file1);
        ArrayList<Integer> a = (ArrayList<Integer>) is1.readObject();
        FileInputStream file2 = new FileInputStream("DATA2.in");
        ObjectInputStream is2 = new ObjectInputStream(file2);
        ArrayList<Integer> b = (ArrayList<Integer>) is2.readObject();
        TreeMap<Integer, Integer> r = new TreeMap<>();
        for (Integer x : a) {
            if (check(x) && check(1000000 - x) && b.indexOf(1000000 - x) != -1 && x < 1000000 - x) {
                r.put(x, 1000000 - x);
            }
        }
        for (Integer i : r.keySet()) {
            System.out.println(i + " " + r.get(i));
        }
    }
}
