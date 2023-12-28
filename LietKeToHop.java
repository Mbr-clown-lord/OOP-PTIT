
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
public class LietKeToHop {
    static Scanner sc=new Scanner(System.in);
    static int[] A=new int[101];
    static boolean[] U=new boolean[101];
    static int n,k,cnt=0;
    public static void solve(){
        cnt++;
        for(int i=1;i<=k;i++){
            System.out.print(A[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i){
        Arrays.fill(U, false);
        for(int j=A[i-1]+1;j<=n-k+i;j++){
            if(U[j]==false){
                A[i]=j;
            if(i==k)
                solve();
            else
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        n=sc.nextInt();
        k=sc.nextInt();
        A[0]=0;
        Try(1);
        System.out.println("\nTong cong co "+cnt+" to hop");
    }
}
