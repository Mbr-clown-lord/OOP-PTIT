package J07076;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepMaTran {

    public static void main(String[] args) throws FileNotFoundException {
        File matran = new File("MATRIX.in");
        Scanner sc = new Scanner(matran);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            int[][] b = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j] = sc.nextInt();
                    if (j == q - 1) {
                        a.add(b[i][j]);
                    }
                }
            }
            Collections.sort(a);
            {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (j == q - 1) {
                            System.out.print(a.get(i) + " ");
                        } else {
                            System.out.print(b[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
