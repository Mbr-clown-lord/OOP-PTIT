
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
public class ThuGonDaySo {
    static Scanner sc=new Scanner(System.in);
    static int n;
    static ArrayList<Integer> A=new ArrayList<>();
    public static void main(String[] args) {
        n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            A.add(num);
        }
        int i=0;
        while((long)(A.get(i)+A.get(i+1))%2==0&&A.size()>0){
            A.remove(i);
            i++;
        }
        System.out.println(A.size());
    }
}
