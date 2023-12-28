
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class WordSet {

    private String line;

    public WordSet(String line) {
        this.line = line;
    }

    public String union(WordSet s2) {
        ArrayList<String> r = new ArrayList<>();
        String[] a = this.line.split("\\s");
        String[] b = s2.line.split("\\s");
        for (String i : a) {
            String tmp = i.toLowerCase();
            if (!r.contains(tmp)) {
                r.add(tmp);
            }
        }
        for (String i : b) {
            String tmp = i.toLowerCase();
            if (!r.contains(tmp)) {
                r.add(tmp);
            }
        }
        String result = "";
        Collections.sort(r);
        for (String i : r) {
            result += i + " ";
        }
        return result;
    }

    public String intersection(WordSet s2) {
        ArrayList<String> r = new ArrayList<>();
        String[] a = this.line.split("\\s");
        String[] b = s2.line.split("\\s");
        for (String i : a) {
            String tmp1 = i.toLowerCase();
            for (String j : b) {
                String tmp2 = j.toLowerCase();
                if (tmp1.equals(tmp2) && !r.contains(tmp1)) {
                    r.add(tmp1);
                }
            }
        }
        String result = "";
        Collections.sort(r);
        for (String i : r) {
            result += i + " ";
        }
        return result;
    }
}

public class LopWordSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
