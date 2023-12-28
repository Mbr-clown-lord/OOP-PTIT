
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger snl=sc.nextBigInteger();
            String tmp=snl.mod(new BigInteger("11")).toString();
            if("0".equals(tmp))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
