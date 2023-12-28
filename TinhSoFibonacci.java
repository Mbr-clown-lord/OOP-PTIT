
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class TinhSoFibonacci {
    static Scanner sc= new Scanner(System.in);
    public void testcase(){
        int n=sc.nextInt();
        long[] f=new long[92];
        f[0]=f[1]=1;
        for(int i=2;i<92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println(f[n-1]);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        TinhSoFibonacci obj=new TinhSoFibonacci();
        while(t-->0){
            obj.testcase();
        }
    }
}