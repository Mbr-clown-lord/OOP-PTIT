
import java.util.ArrayList;
import java.util.Scanner;

public class DayUuThe {

    static Scanner sc = new Scanner(System.in);

    public static boolean check(ArrayList<Integer> a) {
        int chan = 0, le = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        return ((chan > le) && (a.size() % 2 == 0)) || ((chan < le) && (a.size() % 2 != 0));
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            ArrayList<Integer> a = new ArrayList<>();
            for (String x : tmp) {
                a.add(Integer.valueOf(x));
            }
            if (check(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
