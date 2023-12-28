
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NGUYEN VAN CANH
 */
public class BienSoDep {

    static Scanner sc = new Scanner(System.in);

    public static boolean check(String s, String[] a) {
        for (String a1 : a) {
            if (a1.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            String duoi = s.substring(n - 6, n - 3) + s.substring(n - 2);
            int len = duoi.length();
            ArrayList<Character> a = new ArrayList<>();
            for (int i = 0; i < duoi.length(); i++) {
                if (!a.contains(duoi.charAt(i))) {
                    a.add(duoi.charAt(i));
                }
            }
            //xet tung truong hop bien dep
            switch (a.size()) {
                //bien ngu quy
                case 1:
                    System.out.println("YES");
                    break;
                case 2:
                    String s1 = duoi.substring(0, len - 2);
                    String s2 = duoi.substring(len - 2);
                    String[] d3 = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};
                    String[] d2 = {"00", "11", "22", "33", "44", "55", "66", "77", "88", "99"};
                    //bien 23
                    if (check(s1, d3) && check(s2, d2)) {
                        System.out.println("YES");
                    } else {
                        ArrayList<Character> b = new ArrayList<>();
                        for (int i = 0; i < len; i++) {
                            if (!b.contains(duoi.charAt(i))) {
                                b.add(duoi.charAt(i));
                            }
                        }
                        String r = "";
                        for (Character x : b) {
                            r += x;
                        }
                        //bien loc phat
                        if ("68".equals(r) || "86".equals(r)) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                    break;
                default:
                    boolean ok = true;
                    for (int i = 0; i < len - 1; i++) {
                        if (duoi.charAt(i) >= duoi.charAt(i + 1)) {
                            System.out.println("NO");
                            ok = false;
                            break;
                        }
                    }
                    // bien so tien
                    if (ok) {
                        System.out.println("YES");
                    }
                    break;
            }
        }
    }
}
