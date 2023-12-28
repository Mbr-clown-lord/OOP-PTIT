
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class MaTranNhiPhan {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[][] A=new int[n][3]; 
        int dem=0;
        int s1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                A[i][j]=sc.nextInt();
                if(A[i][j]==1)
                    s1++;
            }
            if(s1>=2)
                dem++;
            s1=0;
        }
        System.out.println(dem);
    }
}
