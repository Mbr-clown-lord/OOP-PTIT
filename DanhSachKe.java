
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
public class DanhSachKe {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[][] A=new int[n+1][n+1];
        boolean[] U=new boolean[1001];
        Arrays.fill(U, false);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            if(U[i]==false){
                System.out.print("List("+i+") = ");
                for(int j=1;j<=n;j++){
                    if(A[i][j]==1){
                        System.out.print(j+" ");
                    }
                }
                System.out.print("\n");
                U[i]=true;
            }
        }
    }
}
