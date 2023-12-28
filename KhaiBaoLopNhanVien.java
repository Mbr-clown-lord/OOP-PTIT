
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
class NhanVien{
    private final String mnv="00001";
    private String ten,gt,nsinh,dc,mst,nk;
    public NhanVien(String ten,String gt,String nsinh,String dc,String mst,String nk){
         this.ten=ten;
         this.gt=gt;
         this.nsinh=nsinh;
         this.dc=dc;
         this.mst=mst;
         this.nk=nk;
    }
    @Override
    public String toString(){
        return mnv+" "+ten+" "+gt+" "+nsinh+" "+dc+" "+mst+" "+nk;
    }
}
public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String gt=sc.nextLine();
        String nsinh=sc.nextLine();
        String dc=sc.nextLine();
        String mst=sc.next();
        String nk=sc.next();
        NhanVien Obj=new NhanVien(ten,gt,nsinh,dc,mst,nk);
        System.out.println(Obj);
    }
}
