import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10987 {

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        cnt = 0;

        for (char ch : arr) {
            check(ch);
        }

        System.out.println(cnt);
    }

    private static void check(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            cnt++;
        }
    }
}
