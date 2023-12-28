/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04002;

import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class Rectange {

    private String mau;
    private int dai, rong;

    public Rectange(int dai, int rong, String mau) {
        this.dai = dai;
        this.rong = rong;
        this.mau = mau;
    }

    @Override
    public String toString() {
        return (dai + rong) * 2 + " " + dai * rong + " " + mau;
    }
}

public class KhaiBaoLopHinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();
        String s = sc.next();
        String mau=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
        if (dai <= 0 || rong <= 0) {
            System.out.println("INVALID");
        } else {
            Rectange Obj = new Rectange(dai, rong, mau);
            System.out.println(Obj);
        }
    }
}
