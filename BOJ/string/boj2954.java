import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2954 {

    static String str;
    static String[] before = {"apa", "epe", "ipi", "opo", "upu"};
    static String[] after = {"a", "e", "i", "o", "u"};

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
    }

    static void pro() {
        for (int i = 0; i < 5; i++) {
            str = str.replaceAll(before[i], after[i]);
        }

        System.out.println(str);
    }

}
