/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoKhacNhauTrongFile__1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner sc=new Scanner(file);
        int[] dd=new int[1001];
        while(sc.hasNext()){
            dd[sc.nextInt()]++;
        }
        for(int i=0;i<dd.length;i++){
            if(dd[i]!=0){
                System.out.println(i+" "+dd[i]);
            }
        }
    }
}
