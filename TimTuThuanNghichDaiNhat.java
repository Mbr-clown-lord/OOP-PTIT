
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TimTuThuanNghichDaiNhat {

    static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        StringBuilder tmp = new StringBuilder(s).reverse();
        String x = tmp.toString();
        return s.equals(x);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            s.append(line).append("\n");
        }
        String[] b = s.toString().split("\\s++");
        LinkedHashMap<String, Integer> a = new LinkedHashMap<>();
        int len = 0;
        for (String x : b) {
            if (x.length() >= len && check(x)) {
                len = x.length();
                if (!a.containsKey(x)) {
                    a.put(x, 1);
                } else {
                    a.put(x, a.get(x) + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            if (entry.getKey().length() == len) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
