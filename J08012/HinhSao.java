package J08012;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
public class HinhSao {

    private static class Canh {

        private int dinh1, dinh2;

        public Canh(int dinh1, int dinh2) {
            this.dinh1 = dinh1;
            this.dinh2 = dinh2;
        }
    }

    private static class Dothi {

        private ArrayList<Canh> ds;

        public Dothi(Scanner sc) {
            int n = sc.nextInt();
            this.ds = new ArrayList<>();
            while (n-- > 1) {
                int dinh1 = sc.nextInt();
                int dinh2 = sc.nextInt();
                ds.add(new Canh(dinh1, dinh2));
            }
        }

        boolean check() {
            int dinhchung = this.ds.get(0).dinh1;
            if (this.ds.get(1).dinh1 != dinhchung && this.ds.get(1).dinh2 != dinhchung) {
                dinhchung = this.ds.get(0).dinh2;
            }
            for (Canh x : ds) {
                if (x.dinh1 != dinhchung && x.dinh2 != dinhchung) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dothi a = new Dothi(sc);
        if (a.check()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
