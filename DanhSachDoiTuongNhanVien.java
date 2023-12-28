
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class NhanVien{
    public static int cnt=0;
    private String id,name,gt,ns,dc,mst,nk;
    public NhanVien(String name,String gt,String ns,String dc, String mst,String nk){
        cnt++;
        if(cnt<10)
            this.id="000"+String.format("%02d",cnt);
        else
            this.id="000"+String.format("%01d",cnt);
        this.name=name;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
        this.mst=mst;
        this.nk=nk;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+gt+" "+ns+" "+dc+" "+mst+" "+nk;
    }
}
public class DanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        List<NhanVien> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name=sc.nextLine();
            String gt=sc.nextLine();
            String x=sc.nextLine();
            Date y=sdf.parse(x);
            String ns=sdf.format(y);
            String dc=sc.nextLine();
            String mst=sc.nextLine();
            String z=sc.nextLine();
            Date t=sdf.parse(z);
            String nk=sdf.format(t);
            a.add(new NhanVien(name,gt,ns,dc,mst,nk));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
