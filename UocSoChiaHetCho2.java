
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class UocSoChiaHetCho2 {
    static Scanner sc=new Scanner(System.in);
   
    public static void testcase(){
        int n=sc.nextInt();
        int d=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i%2==0){
                    d++;
                }
                if(n/i%2==0){
                    d++;
                }
                if(n/i==i&&i%2==0){
                    d--;
                }
            }
        }
        System.out.println(d);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        UocSoChiaHetCho2 obj=new UocSoChiaHetCho2();
        while(t-->0){
            obj.testcase();
        }   
    }
}   
