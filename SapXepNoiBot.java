
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class SapXepNoiBot {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] A=new int[101];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        
        for(int i=1;i<n;i++){
            boolean ok=true;
            for(int j=0;j<n-i;j++){
                if(A[j]>A[j+1]){
                    int tmp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=tmp;
                    ok=false;
                }
            }
            if(ok)
                break;
            System.out.print("Buoc "+i+": ");
            for(int j=0;j<n;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println();
        }
    }
}
