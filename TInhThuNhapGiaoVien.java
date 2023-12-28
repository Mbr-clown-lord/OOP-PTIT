
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NGUYEN VAN CANH
 */
class Luong {

    private String manganh, ten;
    private int luongcung;

    public Luong(String manganh, String ten, int luongcung) {
        this.manganh = manganh;
        this.ten = ten;
        this.luongcung = luongcung;
    }

    public int getBacluong() {
        String bac = manganh.substring(2);
        return Integer.parseInt(bac);
    }

    public int getPhucap() {
        String cv = manganh.substring(0, 2);
        if ("HT".equals(cv)) {
            return 2000000;
        } else if ("HP".equals(cv)) {
            return 900000;
        } else {
            return 500000;
        }
    }

    public long tongluong() {
        return luongcung * getBacluong() + getPhucap();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", manganh, ten, getBacluong(), getPhucap(), tongluong());
    }
}

public class TInhThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String manganh = sc.nextLine();
        String ten = sc.nextLine();
        int luongcung = sc.nextInt();
        Luong Obj = new Luong(manganh, ten, luongcung);
        System.out.println(Obj);
    }
}
