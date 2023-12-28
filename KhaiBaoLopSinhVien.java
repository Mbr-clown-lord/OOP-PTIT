
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NGUYEN VAN CANH
 */
class SinhVien {

    private final String ma = "B20DCCN001";
    private String ten, lop, ngaysinh;
    private float gpa;

    public SinhVien() {
        ten = "";
        lop = "";
        ngaysinh = "";
        gpa = 0f;
    }

    public SinhVien(String ten, String lop, String ngaysinh, float gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gpa = gpa;
    }

    public String chuanhoangaysinh() {
        if (ngaysinh.charAt(1) == '/') {
            ngaysinh = '0' + ngaysinh;
            if (ngaysinh.charAt(4) != '/') {
                return ngaysinh;
            } else {
                return ngaysinh.substring(0, 3) + '0' + ngaysinh.substring(3);
            }
        } 
        return ngaysinh;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", ma, ten, lop, chuanhoangaysinh(), gpa);
    }
}

public class KhaiBaoLopSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ngaysinh = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien Obj = new SinhVien(ten, lop, ngaysinh, gpa);
        System.out.println(Obj);
    }
}
