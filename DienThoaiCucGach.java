
import java.util.Scanner;
public class DienThoaiCucGach {
    static Scanner sc=new Scanner(System.in);
    public static boolean stn(String s){
        StringBuilder x=new StringBuilder(s).reverse();
        String r=x.toString();
        return r.equals(s);
    }
    public static char phim(char c){
        String[] a={"ABC","DEF","GHI","JKL","MNO","PQRS"," TVU","WXYZ"};
        char ps ='\0';
        for(int i=0;i<a.length;i++){
            if(a[i].contains(String.valueOf(c))){
                ps=(char)(i+2);
                break;
            }    
        }
        return ps;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String tmp=s.toUpperCase();
            String result="";
            for(int i=0;i<tmp.length();i++){
                result+=phim(tmp.charAt(i));
            }
            if(stn(result))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
