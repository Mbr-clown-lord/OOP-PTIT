
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class GiaoHaiTapHop {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        ArrayList<Integer> R=new ArrayList<>();
        int[] A=new int[n];
        int[] B=new int[m];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            B[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B); 
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(A[i]==B[j]){
                if(!R.contains(A[i])){
                    R.add(A[i]);
                }
                i++;
                j++;  
            }
            else if(A[i]<B[j])
                i++;
            else
                j++;
        }
        for(int x:R){
            System.out.print(x+" ");
        }
    }
}