
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class ChiaTamGiac {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            for(double i=1d;i<n;i++){
                System.out.printf("%.6f",Math.sqrt(i/n)*h);
                System.out.print(" ");
            }
            System.out.print("\n");
            
        }
    }
}
