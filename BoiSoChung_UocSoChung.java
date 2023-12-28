
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NGUYEN VAN CANH
 */
public class BoiSoChung_UocSoChung {

    static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
