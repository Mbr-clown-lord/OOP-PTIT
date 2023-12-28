
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class HopCuaHaiDaySo {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        ArrayList<Integer> R1=new ArrayList<>();
        ArrayList<Integer> R2=new ArrayList<>();
        ArrayList<Integer> R=new ArrayList<>();
        while(n-->0){
            int num=sc.nextInt();
            if(!R1.contains(num))
                R1.add(num);
        }
         while(m-->0){
            int num=sc.nextInt();
            if(!R2.contains(num))
                R2.add(num);
        }
        for(int i:R1){
            R.add(i);
        }
        for(int i:R2){
            if(!R.contains(i))
                R.add(i);
        }
        Collections.sort(R);
        for(int i:R){
            System.out.print(i+" ");
        }
    }
}
