
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class TongGiaiThua {
    static Scanner sc=new Scanner(System.in);
    public long res(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        long s=0;
        TongGiaiThua obj=new TongGiaiThua();
        for(int i=1;i<=n;i++){
            s+=obj.res(i);
        }
        System.out.println(s);
    }
   
}
