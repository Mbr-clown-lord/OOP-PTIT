/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoKhacNhauTrongFile__2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file=new FileInputStream("DATA.in");
        DataInputStream is=new DataInputStream(file);
        TreeMap<Integer,Integer> ds=new TreeMap<>();
        for(int i=0;i<100000;i++){
            int a=is.readInt();
            if(ds.containsKey(a)){
                ds.put(a, ds.get(a)+1);
            }else{
                ds.put(a, 1);
            }
        }
        for(Integer x:ds.keySet()){
            System.out.println(x+" "+ds.get(x));
        }
    }
}
