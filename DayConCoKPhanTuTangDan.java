
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
public class DayConCoKPhanTuTangDan {
    static Scanner sc=new Scanner(System.in);
    static int n,k;
    static int[] A=new int[101];
    static int[] B=new int[101];
    static boolean[] U=new boolean[101];
    public static void solve(){
        for(int i=1;i<=k;i++){
            System.out.print(B[A[i]]+" ");
        }
        System.out.print("\n");
    }
    public static void Try(int i){
        Arrays.fill(U, false);
        for(int j=A[i-1]+1;j<=n-k+i;j++){
            if(U[i]==false){
                A[i]=j;
            if(i==k)
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
            k=sc.nextInt();
            A[0]=0;
            for(int i=1;i<=n;i++){
                B[i]=sc.nextInt();
            }
            for(int i=1;i<=n-1;i++){
                for(int j=i+1;j<=n;j++){
                    if(B[i]>B[j]){
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