package J07023;

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
public class NguyenToVaThuanNghich {
    public static boolean tn(int n){
        String s = String.valueOf(n);   
        for(int i=0 ; i<=s.length()/2; i++)
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return true;
    }

    public static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i= 3;i*i<=n;i+=2)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file1 = new FileInputStream("DATA1.in");
        ObjectInputStream is1 = new ObjectInputStream(file1);
        FileInputStream file2 = new FileInputStream("DATA2.in");
        ObjectInputStream is2 = new ObjectInputStream(file2);
        ArrayList<Integer> a = (ArrayList<Integer>) is1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) is2.readObject();
        TreeMap<Integer, Integer> ds1 = new TreeMap<>();
        TreeMap<Integer, Integer> ds2 = new TreeMap<>();
        for (Integer x : a) {
            if (ds1.containsKey(x)) {
                ds1.put(x, ds1.get(x) + 1);
            } else if (check(x) &&tn(x)&& b.indexOf(x) != -1) {
                ds1.put(x, 1);
            }
        }
        for (Integer x : b) {
            if (ds2.containsKey(x)) {
                ds2.put(x, ds2.get(x) + 1);
            } else if (ds1.containsKey(x)) {
                ds2.put(x, 1);
            }
        }
        for (Integer x : ds1.keySet()) {
            System.out.println(x + " " + ds1.get(x) + " " + ds2.get(x));
        }
    }
}
