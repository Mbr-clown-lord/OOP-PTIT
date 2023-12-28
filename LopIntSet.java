
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class IntSet {
    
    private int[] c;
    
    public IntSet(int[] a) {
        this.c = a;
    }
    public int[] getSet(){
        return c;
    }
    public IntSet union(IntSet s2) {
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < this.c.length; i++) {
            if (!r.contains(this.c[i])) {
                r.add(this.c[i]);
            }
        }
        for (int i = 0; i < s2.c.length; i++) {
            if (!r.contains(s2.c[i])) {
                r.add(s2.c[i]);
            }
        }
        Collections.sort(r);
        int[] R = new int[r.size()];
        int index = 0;
        for (Integer i : r) {
            R[index] = i.intValue();
            index++;
        }
        return new IntSet(R);
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<getSet().length;i++){
            sb.append(getSet()[i]);
            if (i < getSet().length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

public class LopIntSet {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
