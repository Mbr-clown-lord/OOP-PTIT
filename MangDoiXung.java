
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
public class MangDoiXung {
    static Scanner sc=new Scanner(System.in);
    public static boolean check(String s){
        String olds=s;
        String news="";
        for(int i=s.length()-1;i>=0;i--){
            news+=s.charAt(i);
        }
        return olds.equals(news);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s="";
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                a.add(num);
                s+=(char)(a.get(i)+'0');
            }
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        } 
    }
}
