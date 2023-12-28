
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class DiaChiEmail {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> b=new HashMap<>();
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.trim().split("\\s++");
            String r="";
            for(int i=0;i<a.length-1;i++){
                r+=(a[i].substring(0, 1).toLowerCase());
            }
            r=a[a.length-1].toLowerCase()+r;
            if(!b.containsKey(r)){
                System.out.println(r+"@ptit.edu.vn");
                b.put(r,2);
            }
            else{
                System.out.println(r+b.get(r)+"@ptit.edu.vn");
                b.put(r,b.get(r)+1);
            }
        }
    }         
}
