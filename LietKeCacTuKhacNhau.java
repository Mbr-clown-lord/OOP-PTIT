
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
import java.util.TreeSet;

class WordSet {

    private Set<String> set;

    public WordSet(String filename) throws FileNotFoundException {
        File Obj = new File("VANBAN.in");
        Scanner sc = new Scanner(Obj);
        set = new TreeSet<>();
        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (String i : set) {
            s += i + "\n";
        }
        return s;
    }
}

public class LietKeCacTuKhacNhau {

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
