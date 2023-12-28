/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07040;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class LietKeTheoSoLanXuatHien {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("NHIPHAN.in");
        ObjectInputStream is = new ObjectInputStream(file);
        ArrayList<String> a = (ArrayList<String>) is.readObject();
        File vanban = new File("VANBAN.in");
        Scanner sc = new Scanner(vanban);
        Set<String> ss=new HashSet<>();
        for (String x : a) {
            String[] s = x.toLowerCase().trim().split("\\s++");
            for (String i : s) {
                ss.add(i);
            }
        }
         Set<String> r=new HashSet<>();
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            if(ss.contains(s)&&!r.contains(s)){
                System.out.println(s);
                r.add(s);
            }
        }
    }
}
