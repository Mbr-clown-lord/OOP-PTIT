
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NGUYEN VAN CANH
 */
public class DayConTangDan {

    static int n;
    static int[] b = new int[21];
    static int[] a = new int[21];
    static ArrayList<String> r = new ArrayList<>();

    // ham kiem tra day so tang
    public static boolean check(ArrayList<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i + 1) - a.get(i) < 0) {
                return false;
            }
        }
        return true;
    }

    // hàm xu ly day con tang
    public static void solve() {
        String R = "";
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1) {
                c.add(b[i]);
            }
        }
        if (c.size() > 1 && check(c)) {
            for (Integer i : c) {
                R += Integer.toString(i) + " ";
            }
        }
        r.add(R);
    }

    // ham quay lui xau nhi phan
    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            if (i == n) {
                solve();
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("C:\\Users\\NGUYEN VAN CANH\\DAYSO.in");
        Scanner sc = new Scanner(Obj);
        ArrayList<String> d = new ArrayList<>();
        while (sc.hasNextLine()) {
            d.add(sc.nextLine());
        }
        n = Integer.parseInt(d.get(0));
        String[] x = d.get(1).split(" ");
        int index = 1;
        for (String i : x) {
            b[index] = Integer.parseInt(i);
            index++;
        }
        Try(1);
        Collections.sort(r);
        for (String i : r) {
            System.out.println(i);
        }
    }
}
