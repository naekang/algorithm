import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1769 {

    static String X;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        X = br.readLine();
    }

    static void pro() {

        int ans = 0;

        while (true) {
            long sum = 0;
            if (X.length() == 1) {
                break;
            }

            for (int i = 0; i < X.length(); i++) {
                sum += Integer.parseInt(String.valueOf(X.charAt(i)));
            }
            ans++;
            X = String.valueOf(sum);
        }

        if (Integer.parseInt(X) % 3 == 0) {
            sb.append(ans).append('\n').append("YES");
        } else {
            sb.append(ans).append('\n').append("NO");
        }

        System.out.println(sb.toString());
    }
}
