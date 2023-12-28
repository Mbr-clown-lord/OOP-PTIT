

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
public class DayConCoTongLe {
    static Scanner sc=new Scanner(System.in);
    static int[] A=new int[101];
    static int[] B=new int[101];
    static boolean[] U=new boolean[101];
    static int n;
    public static void solve(){
        long s=0;
        for(int i=1;i<=n;i++){
            s+=A[i]*B[i];
        }
        if(s%2!=0){
             for(int i=1;i<=n;i++){
                if(A[i]==1){
                    System.out.print(B[i]+" ");
                }
             }
             System.out.print("\n");
        }
     
    }
    public static  void Try(int i){
        Arrays.fill(U, false);
        for(int j=0;j<=1;j++){
            if(U[j]==false){
                A[i]=j;
                if(i==n)
                    solve();
                else
                    Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                B[i]=sc.nextInt();
            }
            for(int i=1;i<=n-1;i++){
                for(int j=i+1;j<=n;j++){
                    if(B[i]<B[j]){
                        int tmp=B[i];
                        B[i]=B[j];
                        B[j]=tmp;
                    }
                }
            }
            Try(1);
        }
    }
}
