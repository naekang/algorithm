import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int ans = str.charAt(i);

            if (65 <= ans && ans <= 90) {
                ans += 13;

                if (ans > 90) {
                    int shift = ans - 91;
                    ans = shift + 65;
                }
            } else if (ans >= 97 && ans <= 122) {
                ans += 13;

                if (ans > 122) {
                    int shift = ans - 123;
                    ans = shift + 97;
                }
            }
            sb.append((char) ans);
        }
        System.out.println(sb);
    }
}
