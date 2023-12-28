/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class ChuanHoaXauKyTu2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.trim().split("\\s+");
            for(int i=1;i<a.length;i++){
                System.out.print(a[i].substring(0, 1).toUpperCase()+a[i].substring(1).toLowerCase());
                if(i!=a.length-1)
                    System.out.print(" ");
                else
                    System.out.print(", ");
            }
            System.out.print(a[0].toUpperCase()+"\n");
        }
    }
}
