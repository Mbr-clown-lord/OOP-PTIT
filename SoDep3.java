

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoDep3{
    static Scanner sc= new Scanner(System.in);
    public static boolean snt(int n){
        if(n!=2&&n!=5&&n!=7&&n!=3)
            return false;
        return true;
    }
    public static boolean check1(String s){
        StringBuilder x=new StringBuilder(s).reverse();
        String y=x.toString();
        return s.equals(y);
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length();i++){
            if(!snt(Character.getNumericValue(s.charAt(i)))){
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
