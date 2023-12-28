
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class KhoangCachNhoHonK {
    static Scanner sc=new Scanner(System.in);
    static int n,k;
    public static int count(int[] A,int k){
        int count=0;
        int left=0;
        int right=1;
                
        while(right<n){
            if(A[right]-A[left]<k){
                count+=right-left;
                right++;
            }
            else{
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            k=sc.nextInt();
            int[] A=new int[n];
            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
            }
            Arrays.sort(A);
            long dem=count(A,k);
            System.out.println(dem);
        }
    }
}
