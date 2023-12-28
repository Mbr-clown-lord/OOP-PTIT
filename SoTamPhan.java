
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SoTamPhan {
    static Scanner sc=new Scanner(System.in);
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'){
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
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
