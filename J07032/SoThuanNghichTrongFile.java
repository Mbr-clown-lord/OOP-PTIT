
package J07032;

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
public class SoThuanNghichTrongFile {
    static boolean thuanNghich(int n){
        String s = String.valueOf(n);
        if(s.length()%2==0||s.length()==1) return false;
        for(int i=0 ; i<=s.length()/2; i++)
            if(s.charAt(i)!=s.charAt(s.length()-i-1)||s.charAt(i)%2==0) return false;
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream np1 = new FileInputStream("DATA1.in");
        ObjectInputStream is1 = new ObjectInputStream(np1);
        FileInputStream np2 = new FileInputStream("DATA2.in");
        ObjectInputStream is2 = new ObjectInputStream(np2);
        ArrayList<Integer> a = (ArrayList<Integer>) is1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) is2.readObject();
        TreeMap<Integer, Integer> res = new TreeMap<>();
        for(int i : b){
            if(res.containsKey(i)) res.put(i, res.get(i)+1);
            else if(thuanNghich(i)&&a.indexOf(i)!=-1) res.put(i, 1);
        }
        for(int i : a)
            if(res.containsKey(i)) res.put(i, res.get(i)+1);
        int cnt = 0;
        for (Integer i : res.keySet()) {
            cnt++;
            System.out.println(i + " " + res.get(i));
            if (cnt == 10) {
                break;
            }
        }
    }
}
