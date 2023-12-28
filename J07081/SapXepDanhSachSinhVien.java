/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07081;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class SV implements Comparable<SV> {

    private String msv, name, sdt, email, ten, ho, dem;

    public SV(String msv, String name, String sdt, String email) {
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        String[] a = name.trim().split("\\s++");
        this.ten = a[a.length - 1];
        this.ho = a[0];
        this.dem = a[1];
    }

    public String getTen() {
        return ten;
    }

    public String getDem() {
        return dem;
    }

    public String getHo() {
        return ho;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public int compareTo(SV other) {
        if (this.getTen().compareTo(other.getTen()) == 0) {
            if (this.getHo().compareTo(other.getHo()) == 0) {
                if (this.getDem().compareTo(other.getDem()) == 0) {
                    return this.getMsv().compareTo(other.getMsv());
                } else {
                    return this.getDem().compareTo(other.getDem());
                }
            } else {
                return this.getHo().compareTo(other.getHo());
            }
        } else {
            return this.getTen().compareTo(other.getTen());
        }
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + sdt + " " + email;
    }
}

public class SapXepDanhSachSinhVien {

    public static void main(String[] args) throws FileNotFoundException {
        File sinhvien = new File("SINHVIEN.in");
        Scanner sc = new Scanner(sinhvien);
        ArrayList<SV> ds = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            ds.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for (SV x : ds) {
            System.out.println(x);
        }
    }
}
