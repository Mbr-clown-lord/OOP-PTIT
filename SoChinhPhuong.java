
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoChinhPhuong {
    static Scanner sc=new Scanner(System.in);
    public static void testcase(){
        int n=sc.nextInt();
        double a = Math.sqrt(n);
        a=(int)a;
        if(a*a==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        SoChinhPhuong obj=new SoChinhPhuong();
        while(t-->0){
            obj.testcase();
        }
    }
}
