
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
public class SoLanXuatHien {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        int Cnt=1;
        while(t-->0){
            
            int n=sc.nextInt();
            ArrayList<Integer> A=new ArrayList<>();
            Map<Integer,Integer> HM=new LinkedHashMap<>();
            while(n-->0){
                int num=sc.nextInt();
                if(HM.containsKey(num)){
                    HM.put(num, HM.get(num)+1);
                }
                else{
                    HM.put(num, 1);
                }
            }
            System.out.println("Test "+Cnt+":");
            for (Map.Entry<Integer, Integer> entry : HM.entrySet()){
                System.out.println(entry.getKey()+" xuat hien "+entry.getValue()+" lan");
            }
            Cnt++;
        }    
    }
}
