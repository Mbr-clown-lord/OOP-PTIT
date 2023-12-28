
package J07015;

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
public class SoNguyenToTrongFileNhiPhan {
    public static boolean check(int n){
        if(n<2)
            return false;
        for (int i = 2 ;i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream Filenp=new FileInputStream("SONGUYEN.in");
        ObjectInputStream is=new ObjectInputStream(Filenp);
        ArrayList<Integer> a=(ArrayList<Integer>) is.readObject();
        TreeMap<Integer,Integer> ds=new TreeMap<>();
        for(int i:a){
            if(check(i)){
                if(ds.containsKey(i)){
                    ds.put(i, ds.get(i)+1);
                }
                else{
                    ds.put(i, 1);
                }
            }
        }
        for(Integer i:ds.keySet()){
            System.out.println(i+" "+ds.get(i));
        }
    }
}
