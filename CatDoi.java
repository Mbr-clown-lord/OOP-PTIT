
import java.util.Scanner;

/*
 @author NGUYEN VAN CANH
 */
public class CatDoi {
    static Scanner sc = new Scanner(System.in);
    //kiem tra so cat doi hop le
    public boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(((s.charAt(i) != '0' && s.charAt(i) != '1') && s.charAt(i) != '8')&&s.charAt(i)!='9') {
                return false;
            }
        }
        return true;
    }
    //bo test
    public void testcase(){
        String s= sc.nextLine();
        if(check(s)){
            int pos=0;
            while(s.charAt(pos)!='1'&&pos<s.length()){
                pos++;
                if (pos == s.length()) {
                    System.out.println("INVALID");
                    return;
                }
            }
            String r;
            r = s.substring(pos);
            r=r.replace('8', '0');
            r=r.replace('9', '0');
            System.out.println(r);
        }else{
            System.out.println("INVALID");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        CatDoi obj=new CatDoi();
        while(t-->0){
            obj.testcase();
        }
    }
}