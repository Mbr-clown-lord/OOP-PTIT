
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class ChuanHoaXauKyTu1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.trim().split("\\s+");
            for(String x:a){
                System.out.print(x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ");
            }
            System.out.println();
        }
    }
}
