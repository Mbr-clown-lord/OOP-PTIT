
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoKhongLienKe {
    static Scanner sc=new Scanner(System.in);
    public static boolean check1(String s){
        long tong=0;
        for(int i=0;i<s.length();i++){
            tong+=Character.getNumericValue(s.charAt(i));
        }
        return tong%10==0;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))!=2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
        String s=sc.nextLine();
        if(check1(s)&&check2(s))
            System.out.println("YES");
        else
            System.out.println("NO");
        }
    }
}
