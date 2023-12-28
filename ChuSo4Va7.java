
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class ChuSo4Va7 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        int s4=0,s7=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4')
                s4++;
            else if(s.charAt(i)=='7')
                s7++;
        }
        int tong=s4+s7;
        if(tong==4||tong==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
