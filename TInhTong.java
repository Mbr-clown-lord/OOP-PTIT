
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TInhTong {
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        File Obj=new File("C:\\Users\\NGUYEN VAN CANH\\DATA.in");
        Scanner sc=new Scanner(Obj);
        String s="";
        while(sc.hasNext()){
            s=s+ sc.nextLine()+" ";
        }
        //System.out.println(s);
        long sum=0;
        String[] a=s.split("\\s+");
        for(String x:a){
            if(isInteger(x))
                sum+=Integer.parseInt(x);
        }
        System.out.println(sum);
    }
}
