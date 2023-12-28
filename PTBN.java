
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class PTBN {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a==0f){
             if(b==0f)
                System.out.println("VSN");
             else
                System.out.println("VN");
        }
        else
            System.out.printf("%.2f",-b/a);
    }
}
