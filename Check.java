
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class Check {
     static Scanner sc=new Scanner(System.in);
     public static boolean check1(String s){
        StringBuilder x=new StringBuilder(s).reverse();
        String y=x.toString();
        return s.equals(y);
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2!=0)
                return false;
        }
        return false;
    }
    public static void main(String[] args) {
        String s=sc.nextLine();
        if(check2(s))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
