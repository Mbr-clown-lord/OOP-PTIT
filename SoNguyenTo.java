import java.util.Scanner;

public class SoNguyenTo {
    static Scanner sc = new Scanner(System.in);

    public boolean snt(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void testcase() {
        int n = sc.nextInt();
        if (snt(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        SoNguyenTo obj = new SoNguyenTo();
        while (t-->0) {
            obj.testcase();
        }
    }
}