
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class IntSet {

    private int[] c;

    public IntSet(int[] a) {
        this.c = a;
    }

    public int[] getIntSet() {
        return c;
    }

    public IntSet intersection(IntSet s2) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();
        for (int i = 0; i < this.c.length; i++) {
            if (!x.contains(this.c[i])) {
                x.add(this.c[i]);
            }
        }
        for (int i = 0; i < s2.c.length; i++) {
            if (!y.contains(s2.c[i])) {
                y.add(s2.c[i]);
            }
        }
        for (Integer i : x) {
            Integer tmp1 = i;
            for (Integer j : y) {
                Integer tmp2 = j;
                if (tmp1.equals(tmp2) && !z.contains(tmp1)) {
                    z.add(tmp1);
                }
            }
        }
        Collections.sort(z);
        int[] r = new int[z.size()];
        int index = 0;
        for (Integer i : z) {
            r[index] = i.intValue();
            index++;
        }
        return new IntSet(r);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getIntSet().length; i++) {
            sb.append(getIntSet()[i]);
            if (i < getIntSet().length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

public class LopIntSet2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\NGUYEN VAN CANH\\DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
