
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class TapTuRiengCuaHaiXau {
    static Scanner sc=new Scanner(System.in);
    public static boolean check(String x,ArrayList<String> A){
        for(int i=0;i<A.size();i++){
            if(x.equals(A.get(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1,s2;
            s1=sc.nextLine();
            s2=sc.nextLine();
            ArrayList<String> a=new ArrayList<>();
            ArrayList<String> b=new ArrayList<>();
            String[] A=s1.split("\\s");
            String[] B=s2.split("\\s");
            Arrays.sort(A);
            Arrays.sort(B);
            for(String x:A){
                if(!a.contains(x)){
                    a.add(x);
                }
            }
            for(String y:B){
                if(!b.contains(y)){
                    b.add(y);
                }
            }
            
//            for(String i:a){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//            for(String i:b){
//                System.out.print(i+" ");
//            }
//            System.out.println();
            for(int i=0;i<a.size();i++){
                if(check(a.get(i),b))
                    System.out.print(a.get(i)+" ");
            }
            System.out.println();
        }
    }
}
